package co.edu.unbosque.model;

public class ComidaChatarraDTO extends ProductoDTO {
	private static ComidaChatarraDTO instancia;
	private String tipoComida;
	private boolean azucar;

	private ComidaChatarraDTO() {
	}
	
	public static ComidaChatarraDTO getInstancia() {
		if(instancia == null) {
			instancia= new ComidaChatarraDTO();
		}
		return instancia;
	}
	

	private ComidaChatarraDTO(String tipoComida, boolean azucar) {
		super();
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}
	
	public static ComidaChatarraDTO getInstancia(String tipoComida, boolean azucar) {
		if(instancia == null) {
			instancia= new ComidaChatarraDTO(tipoComida, azucar);
		}
		return instancia;
	}
	

	private ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoComida, boolean azucar) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}
	
	public static ComidaChatarraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoComida, boolean azucar) {
		if(instancia == null) {
			instancia= new ComidaChatarraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	private ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}
	public static ComidaChatarraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		if(instancia == null) {
			instancia= new ComidaChatarraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public boolean isAzucar() {
		return azucar;
	}

	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
	}

	@Override
	public String toString() {
		return "ComidaChatarraDTO [tipoComida=" + tipoComida + ", azucar=" + azucar + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return super.vencimiento() + "Y se vence si durante el proceso de fabricacion se hace algo mal";
	}

}
