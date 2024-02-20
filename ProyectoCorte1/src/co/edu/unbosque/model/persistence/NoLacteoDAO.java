package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.NoLacteoDTO;

public class NoLacteoDAO implements CRUDOperation{
	private ArrayList<NoLacteoDTO> listaDeDatos;

	public NoLacteoDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		NoLacteoDTO datos = (NoLacteoDTO)o;
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
		NoLacteoDTO update = (NoLacteoDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			NoLacteoDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setTipoNoLacteo(update.getTipoNoLacteo());
			simpli.setOrigen(update.getOrigen());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(NoLacteoDTO bloque: listaDeDatos) {
			salida += conteo + "->" + bloque.toString() + "\n";
			conteo++;
		}
		return salida;
	}
}