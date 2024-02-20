package co.edu.unbosque.model;

public class LacteoDTO extends ProductoDTO {

	private String tipoLacteo;
	private double cantidad;

	public LacteoDTO() {
	}

	public LacteoDTO(String tipoLacteo, double cantidad) {
		super();
		this.tipoLacteo = tipoLacteo;
		this.cantidad = cantidad;
	}

	public LacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoLacteo, double cantidad) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoLacteo = tipoLacteo;
		this.cantidad = cantidad;
	}

	public LacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public String getTipoLacteo() {
		return tipoLacteo;
	}

	public void setTipoLacteo(String tipoLacteo) {
		this.tipoLacteo = tipoLacteo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LacteoDTO [tipoLacteo=" + tipoLacteo + ", cantidad=" + cantidad + ", getNombre=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		return super.vencimiento() + "Y se vence si no se refrigera bien o se junta con citricos";
	}

}
