package co.edu.unbosque.model;

public class FrutaDTO extends ProductoDTO {

	private boolean deTemporada;
	private String metodoConservacion;

	public FrutaDTO() {
	}

	public FrutaDTO(boolean deTemporada, String metodoConservacion) {
		super();
		this.deTemporada = deTemporada;
		this.metodoConservacion = metodoConservacion;
	}

	public FrutaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.deTemporada = deTemporada;
		this.metodoConservacion = metodoConservacion;
	}

	public FrutaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public boolean isDeTemporada() {
		return deTemporada;
	}

	public void setDeTemporada(boolean deTemporada) {
		this.deTemporada = deTemporada;
	}

	public String getMetodoConservacion() {
		return metodoConservacion;
	}

	public void setMetodoConservacion(String metodoConservacion) {
		this.metodoConservacion = metodoConservacion;
	}

	@Override
	public String toString() {
		return "FrutaDTO [deTemporada=" + deTemporada + ", metodoConservacion=" + metodoConservacion + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc()
				+ ", getCodigoProduc()=" + getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		return super.vencimiento() + "Y se vence mucho mas rapido si se deja cerca a frutas dañadas";
	}

}
