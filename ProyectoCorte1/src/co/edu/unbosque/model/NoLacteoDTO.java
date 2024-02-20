package co.edu.unbosque.model;

public class NoLacteoDTO extends ProductoDTO {

	private String tipoNoLacteo;
	private String origen; // Hace referencia a granja o procesado

	public NoLacteoDTO() {
	}

	public NoLacteoDTO(String tipoNoLacteo, String origen) {
		super();
		this.tipoNoLacteo = tipoNoLacteo;
		this.origen = origen;
	}

	public NoLacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoNoLacteo, String origen) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoNoLacteo = tipoNoLacteo;
		this.origen = origen;
	}

	public NoLacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
	}

	public String getTipoNoLacteo() {
		return tipoNoLacteo;
	}

	public void setTipoNoLacteo(String tipoNoLacteo) {
		this.tipoNoLacteo = tipoNoLacteo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "NoLacteoDTO [tipoNoLacteo=" + tipoNoLacteo + ", origen=" + origen + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		return super.vencimiento() + "Se vencen en un tiempo mas corto si son artesanales";
	}

}
