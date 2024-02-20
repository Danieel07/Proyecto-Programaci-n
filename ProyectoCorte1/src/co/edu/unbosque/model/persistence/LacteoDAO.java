package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.LacteoDTO;

public class LacteoDAO implements CRUDOperation{
	private ArrayList<LacteoDTO> listaDeDatos;

	public LacteoDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		LacteoDTO datos = (LacteoDTO)o;
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
		LacteoDTO update = (LacteoDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			LacteoDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setTipoLacteo(update.getTipoLacteo());
			simpli.setCantidad(update.getCantidad());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(LacteoDTO bloque: listaDeDatos) {
			salida += conteo + "->" + bloque.toString() + "\n";
			conteo++;
		}
		return salida;
	}
	

}
