package co.edu.unbosque.model;

/**
 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel La clase
 *         CarneFriaDTO representa un tipo de producto y hereda de ProductoDTO.
 *         Contiene informacion sobre el tipo de carne y el peso.
 */

public class CarneFriaDTO extends ProductoDTO {
	private static CarneFriaDTO instancia;
	private String tipoCarne;
	private double peso;

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor por
	 *         defecto de la clase CarneFriaDTO.
	 */
	private CarneFriaDTO() {
	}

	public static CarneFriaDTO getInstancia() {
		if (instancia == null) {
			instancia = new CarneFriaDTO();
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el tipo de carne y el peso.
	 * @param tipoCarne El tipo de carne de las carnes frias.
	 * @param peso      El peso de la carne fria.
	 */
	private CarneFriaDTO(String tipoCarne, double peso) {
		super();
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}

	public static CarneFriaDTO getInstancia(String tipoCarne, double peso) {
		if (instancia == null) {
			instancia = new CarneFriaDTO(tipoCarne, peso);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo del producto,
	 *         marca del producto, tipo de carne y el peso del producto.
	 * 
	 * @param nombre        El nombre de la carne fria.
	 * @param precio        El precio de la carne fria.
	 * @param tipoProduc    El tipo de la carne fria.
	 * @param codigoProduc  El codigo de la carne fria.
	 * @param marcaProducto La marca de la carne fria.
	 * @param tipoCarne     El tipo de carne fria.
	 * @param peso          El peso de la carne fria.
	 */

	private CarneFriaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoCarne, double peso) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}

	public static CarneFriaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, String tipoCarne, double peso) {
		if (instancia == null) {
			instancia = new CarneFriaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo del producto
	 *         y marca del producto de la carne fria. .
	 * @param nombre        El nombre de la carne fria.
	 * @param precio        El precio de la carne fria.
	 * @param tipoProduc    El tipo de la carne fria.
	 * @param codigoProduc  El codigo de la carne fria.
	 * @param marcaProducto La marca de la carne fria.
	 */
	private CarneFriaDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public static CarneFriaDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto) {
		if (instancia == null) {
			instancia = new CarneFriaDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Obtiene el tipo de carne.
	 *
	 * @return el tipo de carne
	 */
	public String getTipoCarne() {
		return tipoCarne;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Establece el tipo de carne.
	 *
	 * @param tipoCrne El nuevo tipo de carne.
	 */
	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Obtiene el peso.
	 *
	 * @return peso.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Establece el peso.
	 *
	 * @param peso El nuevo peso de la carne
	 */

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel 
	 * Constructor que Devuelve una representacion de el tipo de carne, peso, nombre,precio, tipo del producto, codigo del producto y la marca del producto.
	 *
	 * @return Una representacion de la carne fria.
	 */

	@Override
	public String toString() {
		return "CarnesFriasDTO [tipoCarne=" + tipoCarne + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}
	
	/**
	 * @author ChavarroOscar,SuazaDiego,CastellanosJose,CortesKevin,AriasEsteban
     * Busca la fecha de vencimiento del producto.
     *
     * @return super El metodo de vencimiento y lo sobreescribe con un mensaje adicional.
     */

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return super.vencimiento() + "Y se vence mucho mas rapido si no se refrigera a cierta temperatura";
	}

}
