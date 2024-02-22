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

	// Metodos para crear productos:
	public void crearCarneFria(String Nombre, int precio, String tipoProduct, String codigoProduct, String marca,
			String tipoCarne, double peso) {
		carneFriaDAO.create(
				CarneFriaDTO.getInstancia(Nombre, precio, tipoProduct, codigoProduct, tipoProduct, tipoCarne, peso));
		System.out.println("Creado Con Exito");
	}

	public void crearComidaChatarra(String Nombre, int precio, String tipoProduct, String codigoProduct, String marca,
			String tipoComidaChatarra, boolean tieneAzucar) {
		comidaChatarraDAO.create(ComidaChatarraDTO.getInstancia(Nombre, precio, tipoProduct, codigoProduct, marca,
				tipoComidaChatarra, tieneAzucar));
		System.out.println("Creado Con Exito");
	}

	public void crearFrutaAcida(String Nombre, int precio, String tipoProduct, String codigoProduct, String marca,
			boolean esDeTemporada, String metodoConseva, int nivelAcidez, boolean paraJugos) {
		frutaAcidaDAO.create(FrutaAcidaDTO.getInstancia(Nombre, precio, tipoProduct, codigoProduct, marca,
				esDeTemporada, metodoConseva, nivelAcidez, paraJugos));
		System.out.println("Creado Con Exito");
	}

	public void crearFrutaDulce(String Nombre, int precio, String tipoProduct, String codigoProduct, String marca,
			boolean esDeTemporada, String metodoConseva, int nivelDeAzucar, boolean paraPostres) {
		frutaDulceDAO.create(FrutaDulceDTO.getInstancia(Nombre, precio, tipoProduct, codigoProduct, marca,
				esDeTemporada, metodoConseva, nivelDeAzucar, paraPostres));
		System.out.println("Creado Con Exito");
	}

	public void crearLacteo(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoLacteo, double cantidad) {
		lacteoDAO.create(
				LacteoDTO.getInstancia(nombre, precio, tipoProduc, codigoProduc, marcaProducto, tipoLacteo, cantidad));
		System.out.println("Creado Con Éxito");
	}

	public void crearNoLacteo(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoNoLacteo, String origen) {
		noLacteoDAO.create(NoLacteoDTO.getInstancia(nombre, precio, tipoProduc, codigoProduc, marcaProducto,
				tipoNoLacteo, origen));
		System.out.println("Creado Con Éxito");
	}

	public void crearVerdura(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoVerdura, double peso) {
		verduraDAO.create(
				VerduraDTO.getInstancia(nombre, precio, tipoProduc, codigoProduc, marcaProducto, tipoVerdura, peso));
		System.out.println("Creado Con Éxito");
	}

//Metodos para eliminar productos:
	public void eliminarCarneFria(int index) {
		boolean eliminado = carneFriaDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con exito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarComidaChatarra(int index) {
		boolean eliminado = comidaChatarraDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con exito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarFrutaAcida(int index) {
		boolean eliminado = frutaAcidaDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con éxito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarFrutaDulce(int index) {
		boolean eliminado = frutaDulceDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con éxito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarLacteo(int index) {
		boolean eliminado = lacteoDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con éxito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarNoLacteo(int index) {
		boolean eliminado = noLacteoDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con éxito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	public void eliminarVerdura(int index) {
		boolean eliminado = verduraDAO.delete(index);
		if (eliminado) {
			System.out.println("Eliminado con éxito");
		} else {
			System.out.println("No se pudo eliminar");
		}
	}

	// Metodos para actualizar productos:
	public void actualizarCarneFria(int index, String Nombre, int precio, String tipoProduct, String codigoProduct,
			String marca, String tipoCarne, double peso) {
		boolean actualizado = carneFriaDAO.update(index,
				CarneFriaDTO.getInstancia(Nombre, precio, tipoProduct, codigoProduct, tipoProduct, tipoCarne, peso));
		if (actualizado) {
			System.out.println("Actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar");
		}
	}

	public void actualizarComidaChatarra(int index, String Nombre, int precio, String tipoProduct, String codigoProduct,
			String marca, String tipoComidaChatarra, boolean tieneAzucar) {
		boolean actualizado = comidaChatarraDAO.update(index, ComidaChatarraDTO.getInstancia(Nombre, precio,
				tipoProduct, codigoProduct, marca, tipoComidaChatarra, tieneAzucar));
		if (actualizado) {
			System.out.println("Actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar");
		}
	}

	public void actualizarFrutaAcida(int index, String Nombre, int precio, String tipoProduct, String codigoProduct,
			String marca, boolean esDeTemporada, String metodoConseva, int nivelAcidez, boolean paraJugos) {
		boolean actualizado = frutaAcidaDAO.update(index, FrutaAcidaDTO.getInstancia(Nombre, precio, tipoProduct,
				codigoProduct, marca, esDeTemporada, metodoConseva, nivelAcidez, paraJugos));
		if (actualizado) {
			System.out.println("Actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar");
		}
	}

	public void actualizarFrutaDulce(int index, String Nombre, int precio, String tipoProduct, String codigoProduct,
			String marca, boolean esDeTemporada, String metodoConseva, int nivelDeAzucar, boolean paraPostres) {
		boolean actualizado = frutaDulceDAO.update(index, FrutaDulceDTO.getInstancia(Nombre, precio, tipoProduct,
				codigoProduct, marca, esDeTemporada, metodoConseva, nivelDeAzucar, paraPostres));
		if (actualizado) {
			System.out.println("Actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar");
		}
	}

	public void actualizarLacteo(int index, String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto, String tipoLacteo, double cantidad) {
		boolean actualizado = lacteoDAO.update(index,
				LacteoDTO.getInstancia(nombre, precio, tipoProduc, codigoProduc, marcaProducto, tipoLacteo, cantidad));
		if (actualizado) {
			System.out.println("Actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar");
		}
	}

	public void actualizarNoLacteo(int index, String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto, String tipoNoLacteo, String origen) {
		boolean actualizado = noLacteoDAO.update(index, NoLacteoDTO.getInstancia(nombre, precio, tipoProduc,
				codigoProduc, marcaProducto, tipoNoLacteo, origen));
		if (actualizado) {
			System.out.println("NoLacteo actualizado con éxito");
		} else {
			System.out.println("No se pudo actualizar el NoLacteo");
		}
	}

	public void actualizarVerdura(int index, String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto, String tipoVerdura, double peso) {
		boolean actualizado = verduraDAO.update(index,
				VerduraDTO.getInstancia(nombre, precio, tipoProduc, codigoProduc, marcaProducto, tipoVerdura, peso));
		if (actualizado) {
			System.out.println("Verdura actualizada con éxito");
		} else {
			System.out.println("No se pudo actualizar la Verdura");
		}
	}

	// Metodos para leer productos:
	public String leerCarneFria() {
		return carneFriaDAO.read();
	}

	public String leerFrutaAcida() {
		return frutaAcidaDAO.read();
	}

	public String leerFrutaDulce() {
		return frutaDulceDAO.read();
	}

	public String leerLacteo() {
		return lacteoDAO.read();
	}

	public String leerNoLacteo() {
		return noLacteoDAO.read();
	}

	public String leerVerdura() {
		return verduraDAO.read();
	}
}
