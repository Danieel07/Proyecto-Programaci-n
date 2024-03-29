package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CarneFriaDTO;

public class CarneFriaDAO implements CRUDOperation {
	private ArrayList<CarneFriaDTO> listaCarnes;

	public CarneFriaDAO() {
		listaCarnes = new ArrayList<>();
	}

	@Override
	public void create(Object o) {
		CarneFriaDTO newcarne = (CarneFriaDTO) o;
		listaCarnes.add(newcarne);
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaCarnes.size()) {
			return false;
		} else {
			listaCarnes.remove(index);
			return true;
		}
	}

	@Override
	public boolean update(int index, Object o) {
		CarneFriaDTO updateCarne = (CarneFriaDTO) o;
		if (index < 0 || index >= listaCarnes.size()) {
			return false;
		} else {
			CarneFriaDTO carne = listaCarnes.get(index);
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
		for (CarneFriaDTO carne : listaCarnes) {
			salida += conteo + "->" + carne.toString() + "\n";
			conteo++;
		}
		return salida;
	}

}
