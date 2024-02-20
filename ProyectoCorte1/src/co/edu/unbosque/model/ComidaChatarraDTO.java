package co.edu.unbosque.model;

public class ComidaChatarraDTO extends ProductoDTO {

	private String tipoComida;
	private boolean azucar;

	public ComidaChatarraDTO() {
		// TODO Auto-generated constructor stub
	}

	public ComidaChatarraDTO(String tipoComida, boolean azucar) {
		super();
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}

	public ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoComida, boolean azucar) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}

	public ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
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
