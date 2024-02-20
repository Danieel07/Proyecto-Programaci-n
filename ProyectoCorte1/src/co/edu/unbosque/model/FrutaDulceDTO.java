package co.edu.unbosque.model;

public class FrutaDulceDTO extends FrutaDTO {

	private int nivelDulzura;
	private boolean paraPostres;

	public FrutaDulceDTO() {
	}

	public FrutaDulceDTO(int nivelDulzura, boolean paraPostres) {
		super();
		this.nivelDulzura = nivelDulzura;
		this.paraPostres = paraPostres;
	}

	public FrutaDulceDTO(boolean deTemporada, String metodoConservacion, int nivelDulzura, boolean paraPostres) {
		super(deTemporada, metodoConservacion);
		this.nivelDulzura = nivelDulzura;
		this.paraPostres = paraPostres;
	}

	public FrutaDulceDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion, int nivelDulzura, boolean paraPostres) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		this.nivelDulzura = nivelDulzura;
		this.paraPostres = paraPostres;
	}

	public FrutaDulceDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			int nivelDulzura, boolean paraPostres) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.nivelDulzura = nivelDulzura;
		this.paraPostres = paraPostres;
	}

	public FrutaDulceDTO(boolean deTemporada, String metodoConservacion) {
		super(deTemporada, metodoConservacion);
	}

	public FrutaDulceDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
	}

	public FrutaDulceDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public int getNivelDulzura() {
		return nivelDulzura;
	}

	public void setNivelDulzura(int nivelDulzura) {
		this.nivelDulzura = nivelDulzura;
	}

	public boolean isParaPostres() {
		return paraPostres;
	}

	public void setParaPostres(boolean paraPostres) {
		this.paraPostres = paraPostres;
	}

	@Override
	public String toString() {
		return "FrutaDulceDTO [nivelDulzura=" + nivelDulzura + ", paraPostres=" + paraPostres + ", isDeTemporada()="
				+ isDeTemporada() + ", getMetodoConservacion()=" + getMetodoConservacion() + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc()
				+ ", getCodigoProduc()=" + getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		return super.vencimiento() + "Y se vence mucho mas rapido si se deja cerca a frutas dañadas";
	}

}
