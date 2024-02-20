package co.edu.unbosque.model;

public abstract class Caducidad implements FechaProducto {

	private String productoCaducidadNombre;

	public Caducidad() {
	}

	public Caducidad(String producto, int caducidad) {
		super();
		this.productoCaducidadNombre = producto;
	}

	public String getProducto() {
		return productoCaducidadNombre;
	}

	public void setProducto(String producto) {
		this.productoCaducidadNombre = producto;
	}

	@Override
	public String toString() {
		return "Caducidad [producto=" + productoCaducidadNombre + "]";
	}

	@Override
	public String vencimiento() {
		return productoCaducidadNombre + "Caduca en:" + fechaCaducidad;
	}

}
