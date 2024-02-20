package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.VerduraDTO;

public class VerduraDAO implements CRUDOperation{
	private ArrayList<VerduraDTO> listaDeDatos;

	public VerduraDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		VerduraDTO datos = (VerduraDTO)o;
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
		VerduraDTO update = (VerduraDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			VerduraDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setTipoVerdura(update.getTipoVerdura());
			simpli.setPeso(update.getPeso());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(VerduraDTO bloque: listaDeDatos) {
			salida += conteo + "->" + bloque.toString() + "\n";
			conteo++;
		}
		return salida;
	}
}
