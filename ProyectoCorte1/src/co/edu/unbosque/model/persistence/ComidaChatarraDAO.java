package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ComidaChatarraDTO;

public class ComidaChatarraDAO implements CRUDOperation{
	private ArrayList<ComidaChatarraDTO> listaDeDatos;

	public ComidaChatarraDAO() {
		listaDeDatos = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		ComidaChatarraDTO datos = (ComidaChatarraDTO)o;
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
		ComidaChatarraDTO update = (ComidaChatarraDTO)o;
		if(index < 0|| index >= listaDeDatos.size()) {
			return false;
		}else {
			ComidaChatarraDTO simpli = listaDeDatos.get(index);
			simpli.setCodigoProduc(update.getCodigoProduc());
			simpli.setMarcaProducto(update.getMarcaProducto());
			simpli.setNombre(update.getNombre());
			simpli.setPrecio(update.getPrecio());
			simpli.setProducto(update.getProducto());
			simpli.setTipoProduc(update.getTipoProduc());
			simpli.setAzucar(update.isAzucar());
			simpli.setTipoComida(update.getTipoComida());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(ComidaChatarraDTO carne: listaDeDatos) {
			salida += conteo + "->" + carne.toString() + "\n";
			conteo++;
		}
		return salida;
	}
}
