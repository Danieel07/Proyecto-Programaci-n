package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner lector;

	public Console() {

		lector = new Scanner(System.in);

	}

	public int leerEntero() {

		return lector.nextInt();
	}

	public double leerDouble() {

		return lector.nextDouble();

	}

	public float leerFloat() {

		return lector.nextFloat();

	}

	public long leerLong() {

		return lector.nextLong();

	}

	public String leerLinea() {

		return lector.nextLine();
	}

	public String leerPalabra() {

		return lector.next();
	}

	public char leerLetra() {

		return lector.next().charAt(0);
	}

	public void imprimirTexto(String texto) {

		System.out.println(texto);

	}

}
