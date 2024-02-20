package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.FrutaDulceDTO;

public class FrutaDulceDAO implements CRUDOperation{
	private ArrayList<FrutaDulceDTO> listaDeDatos;

	public FrutaDulceDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		FrutaDulceDTO datos = (FrutaDulceDTO)o;
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
		FrutaDulceDTO update = (FrutaDulceDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			FrutaDulceDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setDeTemporada(update.isDeTemporada());
			simpli.setMetodoConservacion(update.getMetodoConservacion());
			simpli.setNivelDulzura(update.getNivelDulzura());
			simpli.setParaPostres(update.isParaPostres());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(FrutaDulceDTO bloque: listaDeDatos) {
			salida += conteo + "->" + bloque.toString() + "\n";
			conteo++;
		}
		return salida;
	}
}