package co.edu.unbosque.model;

public class LacteoDTO extends ProductoDTO {
	private static LacteoDTO instancia;

	private String tipoLacteo;
	private double cantidad;

	private LacteoDTO() {
	}

	public static LacteoDTO getInstancia() {
		if (instancia == null) {
			instancia = new LacteoDTO();
		}
		return instancia;
	}

	private LacteoDTO(String tipoLacteo, double cantidad) {
		super();
		this.tipoLacteo = tipoLacteo;
		this.cantidad = cantidad;
	}

	public static LacteoDTO getInstancia(String tipoLacteo, double cantidad) {
		if (instancia == null) {
			instancia = new LacteoDTO(tipoLacteo, cantidad);
		}
		return instancia;
	}

	private LacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoLacteo, double cantidad) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoLacteo = tipoLacteo;
		this.cantidad = cantidad;
	}
	
	
	public static LacteoDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoLacteo, double cantidad){
		if(instancia == null) {
			instancia = new LacteoDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto,tipoLacteo, cantidad);
		}
		return instancia;
	}

	private LacteoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}
	
	public static LacteoDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto){
		if(instancia == null) {
			instancia = new LacteoDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
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
