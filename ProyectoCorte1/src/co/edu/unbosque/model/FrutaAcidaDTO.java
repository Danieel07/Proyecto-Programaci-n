package co.edu.unbosque.model;

public class FrutaAcidaDTO extends FrutaDTO {
	private static FrutaAcidaDTO instancia;
	private int nivelAcidez;
	private boolean paraJugos;

	private FrutaAcidaDTO() {}
	
	public static FrutaAcidaDTO getInstancia() {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO();
		}
		return instancia;
	}

	private FrutaAcidaDTO(int nivelAcidez, boolean paraJugos) {
		super();
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}
	
	public static FrutaAcidaDTO getInstancia(int nivelAcidez, boolean paraJugos) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(nivelAcidez,paraJugos);
		}
		return instancia;
	}

	private FrutaAcidaDTO(boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}
	public static FrutaAcidaDTO getInstancia(boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(deTemporada, metodoConservacion);
		}
		return instancia;
	}

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}
	
	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		}
		return instancia;
	}

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}
	
	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			int nivelAcidez, boolean paraJugos) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	private FrutaAcidaDTO(boolean deTemporada, String metodoConservacion) {
		super(deTemporada, metodoConservacion);
		// TODO Auto-generated constructor stub
	}
	
	public static FrutaAcidaDTO getInstancia(boolean deTemporada, String metodoConservacion) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(deTemporada, metodoConservacion);
		}
		return instancia;
	}

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
	}
	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		}
		return instancia;
	}

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}
	
	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		if(instancia == null) {
			instancia= new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
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
		return super.vencimiento() + "Y se vence mucho mas rapido si se deja cerca a frutas dañadas";
	}

}
