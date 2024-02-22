package co.edu.unbosque.model;

/**
 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel La clase
 *         ComidaChatarraDTO hereda de ProductoDTO y  representa un tipo de producto y hereda de
 *         ProductoDTO. Contiene informacion sobre el tipo de comida y el
 *         azucar.
 */

public class ComidaChatarraDTO extends ProductoDTO {
	private static ComidaChatarraDTO instancia;
	private String tipoComida;
	private boolean azucar;

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor por
	 *         defecto de la clase ComidaChatarraDTO.
	 */

	private ComidaChatarraDTO() {
	}

	public static ComidaChatarraDTO getInstancia() {
		if (instancia == null) {
			instancia = new ComidaChatarraDTO();
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el tipo de comida y el azucar.
	 * @param tipoComida El tipo de comida chatarra.
	 * @param azucar     El azucar de la comida chatarra.
	 */
	private ComidaChatarraDTO(String tipoComida, boolean azucar) {
		super();
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}

	public static ComidaChatarraDTO getInstancia(String tipoComida, boolean azucar) {
		if (instancia == null) {
			instancia = new ComidaChatarraDTO(tipoComida, azucar);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         inicializa el nombre, precio, tipo del producto, codigo del producto,
	 *         marca del producto, tipo de comida y el azucar de la comida chatarra.
	 * 
	 * @param nombre        El nombre de la comida chatarra.
	 * @param precio        El precio de la comida chatarra.
	 * @param tipoProduc    El tipo de la comida chatarra.
	 * @param codigoProduc  El codigo de la comida chatarra.
	 * @param marcaProducto La marca de la comida chatarra.
	 * @param tipoComida    El tipo de comida chatarra.
	 * @param azucar        El azucar de la comida chatarra.
	 */
	private ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto,
			String tipoComida, boolean azucar) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		this.tipoComida = tipoComida;
		this.azucar = azucar;
	}

	public static ComidaChatarraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto, String tipoComida, boolean azucar) {
		if (instancia == null) {
			instancia = new ComidaChatarraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
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
	private ComidaChatarraDTO(String nombre, int precio, String tipoProduc, String codigoProduc, String marcaProducto) {
		super(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
	}

	public static ComidaChatarraDTO getInstancia(String nombre, int precio, String tipoProduc, String codigoProduc,
			String marcaProducto) {
		if (instancia == null) {
			instancia = new ComidaChatarraDTO(nombre, precio, tipoProduc, codigoProduc, marcaProducto);
		}
		return instancia;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Obtiene el tipo de comida chatarra.
	 *
	 * @return el tipo de comida chatarra
	 */

	public String getTipoComida() {
		return tipoComida;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Establece el tipo de comida chatarra.
	 *
	 * @param tipoComida El nuevo tipo de .comida chatarra
	 */

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Establece si la comida chatarra tiene azucar o no.
	 *
	 * @return azucar Si la comida tiene o no azucar.
	 */

	public boolean isAzucar() {
		return azucar;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Establece el nuevo dato de si tiene o no azucar la comida chatarra.
	 *
	 * @param azucar Nuevo dato de la existencia de azucar en la comida chatarra.
	 */

	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
	}

	/**
	 * @author nietoDaniel, suazaDiego , rubioDavid,riveraDaniel Constructor que
	 *         Devuelve una representacion de el tipo de comida, azucar,
	 *         nombre,precio, tipo del producto, codigo del producto y la marca del
	 *         producto.
	 *
	 * @return Una representacion de la comida chatarra.
	 */

	@Override
	public String toString() {
		return "ComidaChatarraDTO [tipoComida=" + tipoComida + ", azucar=" + azucar + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getTipoProduc()=" + getTipoProduc() + ", getCodigoProduc()="
				+ getCodigoProduc() + ", getMarcaProducto()=" + getMarcaProducto() + "]";
	}

	/**
	 * @author ChavarroOscar,SuazaDiego,CastellanosJose,CortesKevin,AriasEsteban
	 *         Busca la fecha de vencimiento del producto.
	 *
	 * @return super El metodo de vencimiento y lo sobreescribe con un mensaje
	 *         adicional.
	 */

	@Override
	public String vencimiento() {
		// TODO Auto-generated method stub
		return super.vencimiento() + "Y se vence si durante el proceso de fabricacion se hace algo mal";
	}

}
