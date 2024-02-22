package co.edu.unbosque.model;

public class VerduraDTO extends ProductoDTO {
	private static VerduraDTO instancia;
	private String tipoVerdura;
	private double peso;

	public VerduraDTO() {
	}

	public static VerduraDTO getInstancia() {
		if (instancia == null) {
			instancia = new VerduraDTO();
		}
		return instancia;
	}

	private VerduraDTO(String tipoVerdura, double peso) {
		super();
		this.tipoVerdura = tipoVerdura;
		this.peso = peso;
	}

	public static VerduraDTO getInstancia(String tipoVerdura, double peso) {
		if (instancia == null) {
			instancia = new VerduraDTO(tipoVerdura, peso);
		}
		return instancia;
	}

	private VerduraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoVerdura, double peso) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoVerdura = tipoVerdura;
		this.peso = peso;
	}

	public static VerduraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, String tipoVerdura, double peso) {
		if (instancia == null) {
			instancia = new VerduraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto, tipoVerdura, peso);
		}
		return instancia;
	}

	private VerduraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
	}

	public static VerduraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto) {
		if (instancia == null) {
			instancia = new VerduraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	public String getTipoVerdura() {
		return tipoVerdura;
	}

	public void setTipoVerdura(String tipoVerdura) {
		this.tipoVerdura = tipoVerdura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "VerduraDTO [tipoVerdura=" + tipoVerdura + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		return super.vencimiento() + "Se vencen en muy poco tiempo si no se refrigera";
	}

}
