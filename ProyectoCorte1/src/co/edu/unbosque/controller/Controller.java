package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;

import co.edu.unbosque.model.persistence.*;

public class Controller {

	private CarneFriaDAO carneFriaDAO;
	private ComidaChatarraDAO comidaChatarraDAO;
	private FrutaAcidaDAO frutaAcidaDAO;
	private FrutaDulceDAO frutaDulceDAO;
	private LacteoDAO lacteoDAO;
	private NoLacteoDAO noLacteoDAO;
	private VerduraDAO verduraDAO;

	public Controller() {
		carneFriaDAO = new CarneFriaDAO();
		comidaChatarraDAO = new ComidaChatarraDAO();
		frutaAcidaDAO = new FrutaAcidaDAO();
		frutaDulceDAO = new FrutaDulceDAO();
		lacteoDAO = new LacteoDAO();
		noLacteoDAO = new NoLacteoDAO();
		verduraDAO = new VerduraDAO();
	}

	public void crearProducto(ProductoDTO producto) {
		CRUDOperation crudOperation = getProductoFactoryDAO(producto);
		crudOperation.create(producto);
	}

	public boolean updateProducto(int index, ProductoDTO producto) {
		return getProductoFactoryDAO(producto).update(index, producto);
	}

	public boolean eliminarProducto(int index, ProductoDTO producto) {
		return getProductoFactoryDAO(producto).delete(index);
	}

	public String readProducto(int index, ProductoDTO producto) {
		return getProductoFactoryDAO(producto).read();
	}

	public CRUDOperation getProductoFactoryDAO(ProductoDTO producto) {

		if (producto instanceof ComidaChatarraDTO dto) {
			return comidaChatarraDAO;

		} else if (producto instanceof CarneFriaDTO dto) {
			return carneFriaDAO;

		} else if (producto instanceof FrutaAcidaDTO dto) {
			return frutaAcidaDAO;

		} else if (producto instanceof FrutaDulceDTO dto) {
			return frutaDulceDAO;

		} else if (producto instanceof LacteoDTO dto) {
			return lacteoDAO;

		} else if (producto instanceof NoLacteoDTO dto) {
			return noLacteoDAO;

		} else if (producto instanceof VerduraDTO dto) {
			return verduraDAO;
		}

		throw new RuntimeException("There is not Dao for the product given");
	}

}
