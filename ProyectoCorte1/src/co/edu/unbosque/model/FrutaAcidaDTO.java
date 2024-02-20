package co.edu.unbosque.model;

public class FrutaAcidaDTO extends FrutaDTO {

	private int nivelAcidez;
	private boolean paraJugos;

	public FrutaAcidaDTO() {
		// TODO Auto-generated constructor stub
	}

	public FrutaAcidaDTO(int nivelAcidez, boolean paraJugos) {
		super();
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public FrutaAcidaDTO(boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public FrutaAcidaDTO(boolean deTemporada, String metodoConservacion) {
		super(deTemporada, metodoConservacion);
		// TODO Auto-generated constructor stub
	}

	public FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		// TODO Auto-generated constructor stub
	}

	public FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
	}

	public int getNivelAcidez() {
		return nivelAcidez;
	}

	public void setNivelAcidez(int nivelAcidez) {
		this.nivelAcidez = nivelAcidez;
	}

	public boolean isParaJugos() {
		return paraJugos;
	}

	public void setParaJugos(boolean paraJugos) {
		this.paraJugos = paraJugos;
	}

	@Override
	public String toString() {
		return "FrutaAcidaDTO [nivelAcidez=" + nivelAcidez + ", paraJugos=" + paraJugos + ", isDeTemporada()="
				+ isDeTemporada() + ", getMetodoConservacion()=" + getMetodoConservacion() + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc()
				+ ", getCodigoProduc()=" + getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return super.vencimiento() + "Y se vence mucho mas rapido si se deja cerca a frutas dañadas";
	}

}
