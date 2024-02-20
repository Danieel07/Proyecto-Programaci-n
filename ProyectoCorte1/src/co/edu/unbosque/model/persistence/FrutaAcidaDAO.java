package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.FrutaAcidaDTO;

public class FrutaAcidaDAO implements CRUDOperation{
	private ArrayList<FrutaAcidaDTO> listaDeDatos;

	public FrutaAcidaDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		FrutaAcidaDTO datos = (FrutaAcidaDTO)o;
		listaDeDatos.add(datos);
	}

	@Override
	public boolean delete(int index) {
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			listaDeDatos.remove(index);
			return true;
		}
	}

	@Override
	public boolean update(int index, Object o) {
		FrutaAcidaDTO update = (FrutaAcidaDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			FrutaAcidaDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setDeTemporada(update.isDeTemporada());
			simpli.setMetodoConservacion(update.getMetodoConservacion());
			simpli.setNivelAcidez(update.getNivelAcidez());
			simpli.setParaJugos(update.isParaJugos());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(FrutaAcidaDTO bloque: listaDeDatos) {
			salida += conteo + "->" + bloque.toString() + "\n";
			conteo++;
		}
		return salida;
	}
}
