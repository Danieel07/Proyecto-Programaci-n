package co.edu.unbosque.model;

public class ProductoDTO extends Caducidad {

	private String nombre;
	private int precio;
	private String tipoProduc;
	private String codigoProduc;
	private String marcaProducto;

	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tipoProduc = tipoProduc;
		this.codigoProduc = codigoProduc;
		this.marcaProducto = marcaProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTipoProduc() {
		return tipoProduc;
	}

	public void setTipoProduc(String tipoProduc) {
		this.tipoProduc = tipoProduc;
	}

	public String getCodigoProduc() {
		return codigoProduc;
	}

	public void setCodigoProduc(String codigoProduc) {
		this.codigoProduc = codigoProduc;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	@Override
	public String toString() {
		return "ProductoDTO [nombre=" + nombre + ", precio=" + precio + ", tipoProduc=" + tipoProduc + ", codigoProduc="
				+ codigoProduc + ", marcaProducto=" + marcaProducto + "]";
	}

}
