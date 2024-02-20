package co.edu.unbosque.model;

public abstract class Caducidad implements FechaProducto {

	private String producto;

	public Caducidad() {
		// TODO Auto-generated constructor stub
	}

	public Caducidad(String producto, int caducidad) {
		super();
		this.producto = producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Caducidad [producto=" + producto + "]";
	}

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return producto + "Caduca en:" + fechaCaducidad;
	}

}
