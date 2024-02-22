package co.edu.unbosque.model;

/**
 * @author NietoDaniel,SuazaDiego,RubioDavid y RiveraDaniel
 *         La clase ProducctoDTO representa a un producto y hereda de Caducidad. Contiene
 *         información sobre el nombre, precio, tipo del producto, codigo del
 *         producto y marca del producto.
 */
public class ProductoDTO extends Caducidad {

	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y RiveraDaniel
	 *         crearon los atributos con su respectivo tipo de dato.
	 */

	private String nombre;
	private int precio;
	private String tipoProduc;
	private String codigoProduc;
	private String marcaProducto;

	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y RiveraDaniel
	 *         Constructor por defecto de la clase ProductoDTO.
	 */

	public ProductoDTO() {

	}
	
	/**
	 * @author NietoDaniel,SuazaDiego,DavidRubio y RiveraDaniel
     * Constructor que inicializa el nombre, precio, tipo de producto, codigo de producto y marca del producto.
     *
     * @param nombre   Nombre del producto.
     * @param precio  Precio del producto.
     * @param tipoProduc  Tipo del producto.
     * @param codigoProduc  Codigo del producto.
     * @param marcaProducto  Marca del producto.
     */

	public ProductoDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tipoProduc = tipoProduc;
		this.codigoProduc = codigoProduc;
		this.marcaProducto = marcaProducto;
	}
	
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y  RiveraDaniel
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @author NietoDavid,SuazaDiego,RubioDavid y RiveraDaniel
     * Establece el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y  RiveraDaniel
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */

	public int getPrecio() {
		return precio;
	}
	
	/**
	 * @author NietoDavid,SuazaDiego,RubioDavid y RiveraDaniel
     * Establece el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y  RiveraDaniel
     * Obtiene el tipo del producto.
     *
     * @return El tipo del producto.
     */

	public String getTipoProduc() {
		return tipoProduc;
	}
	/**
	 * @author NietoDavid,SuazaDiego,RubioDavid y RiveraDaniel
     * Establece el tipo del producto.
     *
     * @param tipoProduc El nuevo tipo del producto.
     */

	public void setTipoProduc(String tipoProduc) {
		this.tipoProduc = tipoProduc;
	}
	
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y  RiveraDaniel
     * Obtiene el codigo del producto.
     *
     * @return El codigo del producto.
     */

	public String getCodigoProduc() {
		return codigoProduc;
	}
	/**
	 * @author NietoDavid,SuazaDiego,RubioDavid y RiveraDaniel
     * Establece el codigo del producto.
     *
     * @param codigoProduc El nuevo codigo del producto.
     */

	public void setCodigoProduc(String codigoProduc) {
		this.codigoProduc = codigoProduc;
	}
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid y  RiveraDaniel
     * Obtiene la marca del producto.
     *
     * @return La marca del producto.
     */

	public String getMarcaProducto() {
		return marcaProducto;
	}
	/**
	 * @author NietoDavid,SuazaDiego,RubioDavid y RiveraDaniel
     * Establece la marca del producto.
     *
     * @param marcaProduc La nueva marca del producto.
     */

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid,RiveraDaniel
     * Devuelve una representación en cadena del producto, incluyendo nombre,precio, tipo del producto 
     * codigo del producto y marca del producto.
     *
     * @return Una cadena que representa al producto.
     */

	@Override
	public String toString() {
		return "ProductoDTO [nombre=" + nombre + ", precio=" + precio + ", tipoProduc=" + tipoProduc + ", codigoProduc="
				+ codigoProduc + ", marcaProducto=" + marcaProducto + "]";
	}
	
	/**
	 * @author NietoDaniel,SuazaDiego,RubioDavid,RiveraDaniel
	 * Busca la fecha de vencimiento del producto se hace un return super
	 * y no se sobrescribe nada ya que es la clase padre y retorna lo mismo que la clase abstracta
	 */

	@Override
	public String vencimiento() {
		return super.vencimiento();
	}

}
