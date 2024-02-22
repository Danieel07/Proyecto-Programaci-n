package co.edu.unbosque.model;

public class CarneFriaDTO extends ProductoDTO {
	private static CarneFriaDTO instancia;
	private String tipoCarne;
	private double peso;

	private CarneFriaDTO() {
	}
	
	public static CarneFriaDTO getInstancia(){
		if(instancia == null) {
			instancia = new CarneFriaDTO();
		}
		return instancia;
	}

	private CarneFriaDTO(String tipoCarne, double peso) {
		super();
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}
	
	public static CarneFriaDTO getInstancia(String tipoCarne, double peso){
		if(instancia == null) {
			instancia = new CarneFriaDTO(tipoCarne, peso);
		}
		return instancia;
	}

	private CarneFriaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoCarne, double peso) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}
	
	public static CarneFriaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoCarne, double peso){
		if(instancia == null) {
			instancia = new CarneFriaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	private CarneFriaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}
	
	public static CarneFriaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto){
		if(instancia == null) {
			instancia = new CarneFriaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
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
