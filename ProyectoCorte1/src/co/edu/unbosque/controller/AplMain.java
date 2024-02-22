package co.edu.unbosque.controller;

/**
 * @author nietoDaniel,SuazaDiego,rubioDavid, riveraDaniel
 * La clase `AplMain` es la clase principal de la aplicación que inicia la ejecución del programa.
 */

import co.edu.unbosque.view.Inicio;

public class AplMain {
	/**
	 * @author nietoDaniel,SuazaDiego,rubioDavid, riveraDaniel El método `main` es
	 *         el punto de entrada de la aplicación.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este
	 *             caso).
	 */

	public static void main(String[] args) {
		// Se crea una instancia del controlador (Controller).

		// Se llama al método `in` del view para iniciar la ejecución de la aplicación.
		Inicio in = new Inicio();
		in.setVisible(true);
	}

}
