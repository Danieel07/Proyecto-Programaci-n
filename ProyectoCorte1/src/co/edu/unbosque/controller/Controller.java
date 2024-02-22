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

	public void crearCarne(Object producto) {
		carneFriaDAO.create(producto);
		System.out.println("Creado Con Exito");
	}

}
