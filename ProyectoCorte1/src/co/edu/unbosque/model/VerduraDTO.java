package co.edu.unbosque.model;

public class VerduraDTO extends ProductoDTO {

	private String tipoVerdura;
	private double peso;

	public VerduraDTO() {
		// TODO Auto-generated constructor stub
	}

	public VerduraDTO(String tipoVerdura, double peso) {
		super();
		this.tipoVerdura = tipoVerdura;
		this.peso = peso;
	}

	public VerduraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoVerdura, double peso) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoVerdura = tipoVerdura;
		this.peso = peso;
	}

	public VerduraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return super.vencimiento() + "Se vencen en muy poco tiempo si no se refrigera";
	}

}
