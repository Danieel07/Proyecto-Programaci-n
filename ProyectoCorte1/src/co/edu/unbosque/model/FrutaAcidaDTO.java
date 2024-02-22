package co.edu.unbosque.model;

/**
 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel La clase
 *         FrutaAcidaDTO hereda de ProductoDTO y representa un tipo de producto
 *         y hereda de ProductoDTO. Contiene informacion sobre el nivel de
 *         acidez y si es para jugos. azucar.
 */

public class FrutaAcidaDTO extends FrutaDTO {
	private static FrutaAcidaDTO instancia;
	private int nivelAcidez;
	private boolean paraJugos;

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor por
	 *         defecto de la clase FrutaAcidaDTO.
	 */

	private FrutaAcidaDTO() {
	}

	public static FrutaAcidaDTO getInstancia() {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO();
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nivel de acidez y si es para jugos.
	 * @param nivelAcidez El nivel de acidez de la fruta acida.
	 * @param paraJugos   El para jugos de la fruta acida.
	 */

	private FrutaAcidaDTO(int nivelAcidez, boolean paraJugos) {
		super();
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public static FrutaAcidaDTO getInstancia(int nivelAcidez, boolean paraJugos) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(nivelAcidez, paraJugos);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el de temporada, metodo de conservacion, nivel de acidez,
	 *         para jugos.
	 * 
	 * @param metodoConvervacion El metodo de conversion.
	 * @param nivelAcidez        El nivel de acidez.
	 * @param tipoProduc         El para jugos de la fruta acida.
	 * @param deTemporada        El de temporada de la fruta acida.
	 */

	private FrutaAcidaDTO(boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public static FrutaAcidaDTO getInstancia(boolean deTemporada, String metodoConservacion, int nivelAcidez,
			boolean paraJugos) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(deTemporada, metodoConservacion);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo de producto,
	 *         marca del producto, de temporada, metodo de conservacion, nivel de
	 *         acidez, para jugos.
	 * 
	 * @param nombre             El nombre de la fruta acida.
	 * @param precio             El precio de la fruta acida.
	 * @param tipoProduc         El tipo de la fruta acida.
	 * @param codigoProduc       El codigo de la fruta acida.
	 * @param marcaProducto      La marca de la fruta acida.
	 * @param metodoConvervacion El metodo de conservasion de la fruta acida.
	 * @param nivelAcidez        El nivel de acidez de la fruta acida.
	 * @param tipoProduc         El para jugos de la fruta acida.
	 * @param deTemporada        El de temporada de la fruta acida.
	 */

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, boolean deTemporada, String metodoConservacion, int nivelAcidez, boolean paraJugos) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada,
					metodoConservacion);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo de producto,
	 *         marca del producto, de temporada, metodo de conservacion, nivel de
	 *         acidez, para jugos.
	 * 
	 * @param nombre        El nombre de la fruta acida.
	 * @param precio        El precio de la fruta acida.
	 * @param tipoProduc    El tipo de la fruta acida.
	 * @param codigoProduc  El codigo de la fruta acida.
	 * @param marcaProducto La marca de la fruta acida.
	 * @param nivelAcidez   El nivel de acidez de la fruta acida.
	 * @param tipoProduc    El para jugos de la fruta acida.
	 */

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			int nivelAcidez, boolean paraJugos) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.nivelAcidez = nivelAcidez;
		this.paraJugos = paraJugos;
	}

	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, int nivelAcidez, boolean paraJugos) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo de producto,
	 *         marca del producto, de temporada, metodo de conservacion, nivel de
	 *         acidez, para jugos.
	 * 
	 * @param deTemporada        El de temporada de la fruta acida.
	 * @param metodoConservacion El metodo de conservacion de la fruta acida.
	 */

	private FrutaAcidaDTO(boolean deTemporada, String metodoConservacion) {
		super(deTemporada, metodoConservacion);
		// TODO Auto-generated constructor stub
	}

	public static FrutaAcidaDTO getInstancia(boolean deTemporada, String metodoConservacion) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(deTemporada, metodoConservacion);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo de producto,
	 *         marca del producto, de temporada, metodo de conservacion, nivel de
	 *         acidez, para jugos.
	 * 
	 * @param nombre             El nombre de la fruta acida.
	 * @param precio             El precio de la fruta acida.
	 * @param tipoProduc         El tipo de la fruta acida.
	 * @param codigoProduc       El codigo de la fruta acida.
	 * @param marcaProducto      La marca de la fruta acida.
	 * @param deTemporada        El nivel de temporada de la fruta acida.
	 * @param metodoConservacion El metodo de conservacion de la fruta acida.
	 */

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			boolean deTemporada, String metodoConservacion) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada, metodoConservacion);
	}

	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, boolean deTemporada, String metodoConservacion) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto, deTemporada,
					metodoConservacion);
		}
		return instancia;
	}

	private FrutaAcidaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public static FrutaAcidaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto) {
		if (instancia == null) {
			instancia = new FrutaAcidaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
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
