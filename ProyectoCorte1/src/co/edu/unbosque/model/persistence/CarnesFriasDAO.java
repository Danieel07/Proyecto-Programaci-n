package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CarneFriasDTO;

public class CarnesFriasDAO implements CRUDOperation{
	private ArrayList<CarneFriasDTO> listaCarnes;

	public CarnesFriasDAO() {
		listaCarnes = new ArrayList<>();
	}
	@Override
	public void create(Object o) {
		CarneFriasDTO newcarne = (CarneFriasDTO)o;
		listaCarnes.add(newcarne);
	}

	@Override
	public boolean delete(int index) {
		if(index < 0|| index >= listaCarnes.size()) {
			return false;
		}else {
			listaCarnes.remove(index);
			return true;
		}
	}

	@Override
	public boolean update(int index, Object o) {
		CarneFriasDTO updateCarne = (CarneFriasDTO)o;
		if(index < 0|| index >= listaCarnes.size()) {
			return false;
		}else {
			CarneFriasDTO carne = listaCarnes.get(index);
			carne.setCodigoProduc(updateCarne.getCodigoProduc());
			carne.setMarcaProducto(updateCarne.getMarcaProducto());
			carne.setNombre(updateCarne.getNombre());
			carne.setPeso(updateCarne.getPeso());
			carne.setPrecio(updateCarne.getPrecio());
			carne.setProducto(updateCarne.getProducto());
			carne.setTipoCarne(updateCarne.getTipoCarne());
			carne.setTipoProduc(updateCarne.getTipoProduc());
			return true;
		}
	}

	@Override
	public String read() {
		String salida = "";
		int conteo = 0;
		for(CarneFriasDTO carne: listaCarnes) {
			salida += conteo + "->" + carne.toString() + "\n";
			conteo++;
		}
		return salida;
	}

}
