package co.edu.unbosque.model;

public class CarneFriasDTO extends ProductoDTO {

	private String tipoCarne;
	private double peso;

	public CarneFriasDTO() {
		// TODO Auto-generated constructor stub
	}

	public CarneFriasDTO(String tipoCarne, double peso) {
		super();
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}

	public CarneFriasDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoCarne, double peso) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}

	public CarneFriasDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "CarnesFriasDTO [tipoCarne=" + tipoCarne + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return super.vencimiento() + "Y se vence mucho mas rapido si no se refrigera a cierta temperatura";
	}

}
