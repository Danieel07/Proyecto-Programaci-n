package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreProducto;
	private JTextField txtPrecio;
	private JTextField txtCodigoDeProducto;
	private JTextField txtMarcaDeProducto;
	private JTextField txtNumIndice;
	
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\daniel\\git\\ProyectoDeCorte1\\ProyectoCorte1\\src\\co\\edu\\unbosque\\view\\icono.png"));
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setFont(UIManager.getFont("Button.font"));
		setTitle("Inventario de la Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Administración De Productos");
		lblTitulo.setBounds(190, 11, 443, 36);
		lblTitulo.setForeground(Color.DARK_GRAY);
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(10, 559, 144, 42);
		btnCrear.setBackground(Color.GREEN);
		btnCrear.setFont(new Font("Arial Black", Font.BOLD, 16));
		contentPane.add(btnCrear);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(670, 559, 144, 42);
		btnEliminar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnEliminar.setBackground(Color.RED);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(340, 559, 144, 42);
		btnActualizar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnActualizar.setBackground(Color.CYAN);
		contentPane.add(btnActualizar);
		
		JLabel lblNombre = new JLabel("Nombre Del Producto:");
		lblNombre.setBounds(10, 49, 113, 14);
		contentPane.add(lblNombre);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setBounds(10, 67, 159, 20);
		contentPane.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio Del Producto");
		lblPrecio.setBounds(10, 99, 113, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(10, 115, 159, 20);
		txtPrecio.setColumns(10);
		contentPane.add(txtPrecio);
		
		JLabel lblTipoDeProducto = new JLabel("Tipo de Producto:");
		lblTipoDeProducto.setBounds(10, 146, 113, 14);
		contentPane.add(lblTipoDeProducto);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(10, 163, 242, 127);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		JButton btnCarnesFrias = new JButton("Carnes Frias");
		btnCarnesFrias.setBackground(Color.BLACK);
		btnCarnesFrias.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCarnesFrias.setBounds(0, 0, 114, 23);
		panelOpciones.add(btnCarnesFrias);
		
		JButton btnComidaChatarra = new JButton("Comida Chatarra");
		btnComidaChatarra.setBackground(Color.BLACK);
		btnComidaChatarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComidaChatarra.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnComidaChatarra.setBounds(124, 0, 117, 23);
		panelOpciones.add(btnComidaChatarra);
		
		JButton btnFrutaDulce = new JButton("Fruta Dulce");
		btnFrutaDulce.setBackground(Color.BLACK);
		btnFrutaDulce.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFrutaDulce.setBounds(0, 34, 114, 23);
		panelOpciones.add(btnFrutaDulce);
		
		JButton btnFrutaAcida = new JButton("Fruta Acida");
		btnFrutaAcida.setBackground(Color.BLACK);
		btnFrutaAcida.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFrutaAcida.setBounds(124, 34, 117, 23);
		panelOpciones.add(btnFrutaAcida);
		
		JButton btnLacteo = new JButton("Lacteo");
		btnLacteo.setBackground(Color.BLACK);
		btnLacteo.setBounds(0, 68, 114, 23);
		panelOpciones.add(btnLacteo);
		
		JButton btnNoLacteo = new JButton("No Lacteo");
		btnNoLacteo.setBackground(Color.BLACK);
		btnNoLacteo.setBounds(124, 68, 117, 23);
		panelOpciones.add(btnNoLacteo);
		
		JButton btnVerduras = new JButton("Verduras");
		btnVerduras.setBackground(Color.BLACK);
		btnVerduras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerduras.setBounds(81, 101, 89, 23);
		panelOpciones.add(btnVerduras);
		
		JLabel lblCodigoDeProducto = new JLabel("Codigo De Producto:");
		lblCodigoDeProducto.setBounds(197, 49, 113, 14);
		contentPane.add(lblCodigoDeProducto);
		
		txtCodigoDeProducto = new JTextField();
		txtCodigoDeProducto.setBounds(197, 67, 159, 20);
		txtCodigoDeProducto.setColumns(10);
		contentPane.add(txtCodigoDeProducto);
		
		JLabel lblMarcaDelProducto = new JLabel("Marca Del Producto:");
		lblMarcaDelProducto.setBounds(197, 99, 113, 14);
		contentPane.add(lblMarcaDelProducto);
		
		txtMarcaDeProducto = new JTextField();
		txtMarcaDeProducto.setBounds(197, 115, 159, 20);
		txtMarcaDeProducto.setColumns(10);
		contentPane.add(txtMarcaDeProducto);
		
		JPanel panelEliminarActualizar = new JPanel();
		panelEliminarActualizar.setBounds(260, 148, 103, 60);
		contentPane.add(panelEliminarActualizar);
		panelEliminarActualizar.setLayout(null);
		
		JLabel lblNumIndice = new JLabel("Numero de Indice:");
		lblNumIndice.setBounds(10, 11, 99, 14);
		panelEliminarActualizar.add(lblNumIndice);
		
		txtNumIndice = new JTextField();
		txtNumIndice.setColumns(10);
		txtNumIndice.setBounds(10, 26, 63, 20);
		panelEliminarActualizar.add(txtNumIndice);
		
		JPanel panelHijo = new JPanel();
		panelHijo.setBounds(370, 58, 450, 490);
		contentPane.add(panelHijo);
		panelHijo.setLayout(null);
		
		JPanel panelHijo2 = new JPanel();
		panelHijo2.setLayout(null);
		panelHijo2.setBounds(10, 301, 346, 247);
		contentPane.add(panelHijo2);

	}
}
