package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Rectangle;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreProducto;
	private JTextField txtPrecio;
	private JTextField txtCodigoDeProducto;
	private JTextField txtMarcaDeProducto;
	private JTextField txtNumIndice;
	private JPanel panelHijo;
	private Controller controlador;
	private String TipoDeProducto;
	private JTextField txtTipodeCarne;
	private JTextField txtPeso;
	private JTextField txtTipoDeComidaChatarra;
	private JTextField txtMetodoDeConserva;
	private JTextField txtNivelDeAcidez;
	private JTextField txtMetodoConservaDulce;
	private JTextField txtNivelDeAzucar;
	private JTextField txtTipoLacteo;
	private JTextField txtCantidad;
	private JTextField txtTipoNoLacteo;
	private JTextField txtOrigenAnimal;
	private JTextField txtTipoVerdura;
	private JTextField txtPesoVerduras;
	private JPanel panelCarnesFrias;
	private JPanel panelComidaChatarra;
	private JPanel panelFrutaAcida;
	private JPanel panelFrutaDulce;
	private JPanel panelLacteo;
	private JPanel panelNoLacteo;
	private JPanel panelVerduras;
	private JEditorPane txtListaDeProductuos;
	private JList listAzucarSioNo;
	private JList listJugosSioNo;
	private JList listPostresSioNoDulce;
	private JList listTempSioNo;
	private JList listTempSioNoDulce;
	private JLabel lblCreadoConExtio;

	public Inicio() {
		setBounds(new Rectangle(0, 0, 0, 0));
		controlador = new Controller();
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\daniel\\git\\ProyectoDeCorte1\\ProyectoCorte1\\src\\co\\edu\\unbosque\\view\\icono.png"));
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setFont(UIManager.getFont("Button.font"));
		setTitle("Inventario de la Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Administración De Productos");
		lblTitulo.setBounds(190, 11, 443, 36);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo);

		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(10, 559, 144, 42);
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = txtNombreProducto.getText();
				String precioStr = txtPrecio.getText();
				int precio = Integer.parseInt(precioStr);
				String codigoProducto = txtCodigoDeProducto.getText();
				String marcaDeProducto = txtMarcaDeProducto.getText();

				if (TipoDeProducto == "Carnes Frias") {
					String tipoCarne = txtTipodeCarne.getText().toString();
					String pesoStr = txtPeso.getText().toString();
					double peso = Double.parseDouble(pesoStr);
					controlador.crearCarneFria(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoCarne, peso);
				} else if (TipoDeProducto == "Comida Chatarra") {
					String tipoComidaChatarra = txtTipoDeComidaChatarra.getText();
					String tieneAzucar = listAzucarSioNo.getSelectedValue().toString();
					boolean isAzucar = false;
					if (tieneAzucar == "Si") {
						isAzucar = true;
					}
					controlador.crearComidaChatarra(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoComidaChatarra, isAzucar);
				} else if (TipoDeProducto == "Fruta Acida") {
					String nvAcidezStr = txtNivelDeAcidez.getText();
					int nivelAcidez = Integer.parseInt(nvAcidezStr);

					String paraJugosStr = listJugosSioNo.getSelectedValue().toString();

					boolean isJugos = false;
					if (paraJugosStr == "Si") {
						isJugos = true;
					}
					String deTemporadaStr = listTempSioNo.getSelectedValue().toString();
					boolean isTemporada = false;
					if (deTemporadaStr == "Si") {
						isTemporada = true;
					}
					String metodoDeConserva = txtMetodoDeConserva.getText();
					controlador.crearFrutaAcida(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							isTemporada, metodoDeConserva, nivelAcidez, isJugos);
				} else if (TipoDeProducto == "Fruta Dulce") {
					String nvDulcuraStr = txtNivelDeAzucar.getText().toString();
					int nvDulcura = Integer.parseInt(nvDulcuraStr);
					String paraPostreStr = listPostresSioNoDulce.getSelectedValue().toString();
					boolean isParaPostre = false;
					if (paraPostreStr == "Si") {
						isParaPostre = true;
					}
					String deTempStr = listTempSioNoDulce.getSelectedValue().toString();
					boolean isTemporada = false;
					if (deTempStr == "Si") {
						isTemporada = true;
					}
					String metodoConserva = txtMetodoConservaDulce.getText().toString();
					controlador.crearFrutaDulce(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							isTemporada, metodoConserva, nvDulcura, isParaPostre);
				} else if (TipoDeProducto == "Lacteo") {
					String tipoLacteo = txtTipoLacteo.getText().toString();
					String cantidadStr = txtCantidad.getText().toString();
					double cantidad = Double.parseDouble(cantidadStr);
					controlador.crearLacteo(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto, tipoLacteo,
							cantidad);
				} else if (TipoDeProducto == "No Lacteo") {
					String tipoNoLacteo = txtTipoNoLacteo.getText().toString();
					String origen = txtOrigenAnimal.getText().toString();
					controlador.crearNoLacteo(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoNoLacteo, origen);
				} else if (TipoDeProducto == "Verduras") {
					String tipoVerdura = txtTipoVerdura.getText();
					String pesoStr = txtPesoVerduras.getText();
					double peso = Double.parseDouble(pesoStr);
					controlador.crearVerdura(nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoVerdura, peso);
				}else {
					lblCreadoConExtio.setText("Algo salio mal");
					lblCreadoConExtio.setVisible(true);
				}
				
				txtNombreProducto.setText("");
				txtPrecio.setText("");
				txtCodigoDeProducto.setText("");
				txtMarcaDeProducto.setText("");
				txtTipodeCarne.setText("");
				txtPeso.setText("");
				txtTipoDeComidaChatarra.setText("");
				txtNivelDeAcidez.setText("");
				txtMetodoDeConserva.setText("");
				txtNivelDeAzucar.setText("");
				txtMetodoConservaDulce.setText("");
				txtTipoLacteo.setText("");
				txtTipoNoLacteo.setText("");
				txtOrigenAnimal.setText("");
				txtCantidad.setText("");
				lblCreadoConExtio.setText("Creado Con Exito");
				lblCreadoConExtio.setVisible(true);
			}
		});
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.GREEN);
		btnCrear.setFont(new Font("Arial Black", Font.BOLD, 16));
		contentPane.add(btnCrear);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String indexStr = txtNumIndice.getText().toString();
				int index = Integer.parseInt(indexStr);
				if (TipoDeProducto == "Carnes Frias") {
					controlador.eliminarCarneFria(index);
				} else if (TipoDeProducto == "Comida Chatarra") {
					controlador.eliminarComidaChatarra(index);
				} else if (TipoDeProducto == "Fruta Acida") {
					controlador.eliminarFrutaAcida(index);
				} else if (TipoDeProducto == "Fruta Dulce") {
					controlador.eliminarFrutaDulce(index);
				} else if (TipoDeProducto == "Lacteo") {
					controlador.eliminarLacteo(index);
				} else if (TipoDeProducto == "No Lacteo") {
					controlador.eliminarNoLacteo(index);
				} else if (TipoDeProducto == "Verduras") {
					controlador.eliminarVerdura(index);
				}else {
					lblCreadoConExtio.setText("Algo salio mal");
					lblCreadoConExtio.setVisible(true);
				}
				lblCreadoConExtio.setText("ELiminado Con Exito");
				lblCreadoConExtio.setVisible(true);
			}
		});
		btnEliminar.setBounds(670, 559, 144, 42);
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnEliminar.setBackground(Color.RED);
		contentPane.add(btnEliminar);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = txtNombreProducto.getText();
				String precioStr = txtPrecio.getText();
				int precio = Integer.parseInt(precioStr);
				String codigoProducto = txtCodigoDeProducto.getText();
				String marcaDeProducto = txtMarcaDeProducto.getText();
				String indexStr = txtNumIndice.getText().toString();
				int index = Integer.parseInt(indexStr);

				if (TipoDeProducto == "Carnes Frias") {
					String tipoCarne = txtTipodeCarne.getText().toString();
					String pesoStr = txtPeso.getText().toString();
					double peso = Double.parseDouble(pesoStr);
					controlador.actualizarCarneFria(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoCarne, peso);
				} else if (TipoDeProducto == "Comida Chatarra") {
					String tipoComidaChatarra = txtTipoDeComidaChatarra.getText();
					String tieneAzucar = listAzucarSioNo.getSelectedValue().toString();
					boolean isAzucar = false;
					if (tieneAzucar == "Si") {
						isAzucar = true;
					}
					controlador.actualizarComidaChatarra(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoComidaChatarra, isAzucar);
					
				} else if (TipoDeProducto == "Fruta Acida") {
					String nvAcidezStr = txtNivelDeAcidez.getText();
					int nivelAcidez = Integer.parseInt(nvAcidezStr);

					String paraJugosStr = listJugosSioNo.getSelectedValue().toString();

					boolean isJugos = false;
					if (paraJugosStr == "Si") {
						isJugos = true;
					}
					String deTemporadaStr = listTempSioNo.getSelectedValue().toString();
					boolean isTemporada = false;
					if (deTemporadaStr == "Si") {
						isTemporada = true;
					}
					String metodoDeConserva = txtMetodoDeConserva.getText();
					controlador.actualizarFrutaAcida(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							isTemporada, metodoDeConserva, nivelAcidez, isJugos);
					
				} else if (TipoDeProducto == "Fruta Dulce") {
					String nvDulcuraStr = txtNivelDeAzucar.getText().toString();
					int nvDulcura = Integer.parseInt(nvDulcuraStr);
					String paraPostreStr = listPostresSioNoDulce.getSelectedValue().toString();
					boolean isParaPostre = false;
					if (paraPostreStr == "Si") {
						isParaPostre = true;
					}
					String deTempStr = listTempSioNoDulce.getSelectedValue().toString();
					boolean isTemporada = false;
					if (deTempStr == "Si") {
						isTemporada = true;
					}
					String metodoConserva = txtMetodoConservaDulce.getText().toString();
					controlador.actualizarFrutaDulce(index ,nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							isTemporada, metodoConserva, nvDulcura, isParaPostre);
					
				} else if (TipoDeProducto == "Lacteo") {
					String tipoLacteo = txtTipoLacteo.getText().toString();
					String cantidadStr = txtTipoLacteo.getText().toString();
					double cantidad = Double.parseDouble(cantidadStr);
					controlador.actualizarLacteo(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto, tipoLacteo,
							cantidad);
				} else if (TipoDeProducto == "No Lacteo") {
					String tipoNoLacteo = txtTipoNoLacteo.getText().toString();
					String origen = txtTipoNoLacteo.getText().toString();
					controlador.actualizarNoLacteo(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoNoLacteo, origen);
				} else if (TipoDeProducto == "Verduras") {
					String tipoVerdura = txtTipoVerdura.getText();
					String pesoStr = txtPesoVerduras.getText();
					double peso = Double.parseDouble(pesoStr);
					controlador.actualizarVerdura(index, nombre, precio, TipoDeProducto, codigoProducto, marcaDeProducto,
							tipoVerdura, peso);
				}else {
					lblCreadoConExtio.setText("Algo salio mal");
					lblCreadoConExtio.setVisible(true);
				}
				txtNombreProducto.setText("");
				txtPrecio.setText("");
				txtCodigoDeProducto.setText("");
				txtMarcaDeProducto.setText("");
				txtTipodeCarne.setText("");
				txtPeso.setText("");
				txtTipoDeComidaChatarra.setText("");
				txtNivelDeAcidez.setText("");
				txtMetodoDeConserva.setText("");
				txtNivelDeAzucar.setText("");
				txtMetodoConservaDulce.setText("");
				txtTipoLacteo.setText("");
				txtTipoNoLacteo.setText("");
				txtOrigenAnimal.setText("");
				txtCantidad.setText("");
				lblCreadoConExtio.setText("Actualizado Con Exito");
				lblCreadoConExtio.setVisible(true);
				
			}
		});
		btnActualizar.setBounds(340, 559, 144, 42);
		btnActualizar.setForeground(Color.BLACK);
		btnActualizar.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnActualizar.setBackground(Color.CYAN);
		contentPane.add(btnActualizar);

		JLabel lblNombre = new JLabel("Nombre Del Producto:");
		lblNombre.setBounds(10, 49, 159, 14);
		contentPane.add(lblNombre);

		txtNombreProducto = new JTextField();
		txtNombreProducto.setBounds(10, 67, 159, 20);
		contentPane.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio Del Producto");
		lblPrecio.setBounds(10, 99, 159, 14);
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
		btnCarnesFrias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Carnes Frias";
				panelCarnesFrias.setVisible(true);
				panelCarnesFrias.setLocation(10, 301);
				panelComidaChatarra.setVisible(false);
				panelFrutaAcida.setVisible(false);
				panelFrutaDulce.setVisible(false);
				panelLacteo.setVisible(false);
				panelNoLacteo.setVisible(false);
				panelVerduras.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerCarneFria());
			}
		});
		btnCarnesFrias.setBackground(Color.WHITE);
		btnCarnesFrias.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCarnesFrias.setBounds(0, 0, 114, 23);
		panelOpciones.add(btnCarnesFrias);

		JButton btnComidaChatarra = new JButton("Comida Chatarra");
		btnComidaChatarra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Comida Chatarra";
				panelComidaChatarra.setLocation(10, 301);
				panelComidaChatarra.setVisible(true);
				panelFrutaAcida.setVisible(false);
				panelFrutaDulce.setVisible(false);
				panelLacteo.setVisible(false);
				panelNoLacteo.setVisible(false);
				panelVerduras.setVisible(false);
				panelCarnesFrias.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerComidaChatarra());
			}
		});
		btnComidaChatarra.setBackground(Color.WHITE);
		btnComidaChatarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComidaChatarra.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnComidaChatarra.setBounds(124, 0, 117, 23);
		panelOpciones.add(btnComidaChatarra);

		JButton btnFrutaDulce = new JButton("Fruta Dulce");
		btnFrutaDulce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Fruta Dulce";
				panelFrutaDulce.setLocation(10, 301);
				panelFrutaDulce.setVisible(true);
				panelFrutaAcida.setVisible(false);
				panelLacteo.setVisible(false);
				panelNoLacteo.setVisible(false);
				panelVerduras.setVisible(false);
				panelCarnesFrias.setVisible(false);
				panelComidaChatarra.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerFrutaDulce());
			}

		});
		btnFrutaDulce.setBackground(Color.WHITE);
		btnFrutaDulce.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFrutaDulce.setBounds(0, 34, 114, 23);
		panelOpciones.add(btnFrutaDulce);

		JButton btnFrutaAcida = new JButton("Fruta Acida");
		btnFrutaAcida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Fruta Acida";
				panelFrutaAcida.setLocation(10, 301);
				panelFrutaAcida.setVisible(true);
				panelLacteo.setVisible(false);
				panelNoLacteo.setVisible(false);
				panelVerduras.setVisible(false);
				panelCarnesFrias.setVisible(false);
				panelComidaChatarra.setVisible(false);
				panelFrutaDulce.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerFrutaAcida());
			}
		});
		btnFrutaAcida.setBackground(Color.WHITE);
		btnFrutaAcida.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFrutaAcida.setBounds(124, 34, 117, 23);
		panelOpciones.add(btnFrutaAcida);

		JButton btnLacteo = new JButton("Lacteo");
		btnLacteo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Lacteo";
				panelLacteo.setLocation(10, 301);
				panelLacteo.setVisible(true);
				panelNoLacteo.setVisible(false);
				panelVerduras.setVisible(false);
				panelCarnesFrias.setVisible(false);
				panelComidaChatarra.setVisible(false);
				panelFrutaDulce.setVisible(false);
				panelFrutaAcida.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerLacteo());
			}
		});
		btnLacteo.setBackground(Color.WHITE);
		btnLacteo.setBounds(0, 68, 114, 23);
		panelOpciones.add(btnLacteo);

		JButton btnNoLacteo = new JButton("No Lacteo");
		btnNoLacteo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "No Lacteo";
				panelNoLacteo.setLocation(10, 301);
				panelNoLacteo.setVisible(true);
				panelVerduras.setVisible(false);
				panelCarnesFrias.setVisible(false);
				panelComidaChatarra.setVisible(false);
				panelFrutaDulce.setVisible(false);
				panelFrutaAcida.setVisible(false);
				panelLacteo.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerNoLacteo());
			}
		});
		btnNoLacteo.setBackground(Color.WHITE);
		btnNoLacteo.setBounds(124, 68, 117, 23);
		panelOpciones.add(btnNoLacteo);

		JButton btnVerduras = new JButton("Verduras");
		btnVerduras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoDeProducto = "Verdura";
				panelVerduras.setLocation(10, 301);
				panelVerduras.setVisible(true);
				panelCarnesFrias.setVisible(false);
				panelComidaChatarra.setVisible(false);
				panelFrutaDulce.setVisible(false);
				panelFrutaAcida.setVisible(false);
				panelLacteo.setVisible(false);
				panelNoLacteo.setVisible(false);
				txtListaDeProductuos.setText(controlador.leerVerdura());
			}
		});
		btnVerduras.setBackground(Color.WHITE);
		btnVerduras.setBounds(81, 101, 89, 23);
		panelOpciones.add(btnVerduras);

		JLabel lblCodigoDeProducto = new JLabel("Codigo De Producto:");
		lblCodigoDeProducto.setBounds(197, 49, 159, 14);
		contentPane.add(lblCodigoDeProducto);

		txtCodigoDeProducto = new JTextField();
		txtCodigoDeProducto.setBounds(197, 67, 159, 20);
		txtCodigoDeProducto.setColumns(10);
		contentPane.add(txtCodigoDeProducto);

		JLabel lblMarcaDelProducto = new JLabel("Marca Del Producto:");
		lblMarcaDelProducto.setBounds(197, 99, 159, 14);
		contentPane.add(lblMarcaDelProducto);

		txtMarcaDeProducto = new JTextField();
		txtMarcaDeProducto.setBounds(197, 115, 159, 20);
		txtMarcaDeProducto.setColumns(10);
		contentPane.add(txtMarcaDeProducto);

		JPanel panelEliminarActualizar = new JPanel();
		panelEliminarActualizar.setBounds(262, 163, 103, 60);
		contentPane.add(panelEliminarActualizar);
		panelEliminarActualizar.setLayout(null);

		JLabel lblNumIndice = new JLabel("Indice:");
		lblNumIndice.setBounds(10, 11, 99, 14);
		panelEliminarActualizar.add(lblNumIndice);

		txtNumIndice = new JTextField();
		txtNumIndice.setColumns(10);
		txtNumIndice.setBounds(10, 26, 63, 20);
		panelEliminarActualizar.add(txtNumIndice);

		panelHijo = new JPanel();
		panelHijo.setBounds(370, 58, 450, 490);
		contentPane.add(panelHijo);
		panelHijo.setLayout(null);

		txtListaDeProductuos = new JEditorPane();
		txtListaDeProductuos.setBounds(0, 0, 450, 490);
		panelHijo.add(txtListaDeProductuos);

		panelCarnesFrias = new JPanel();
		panelCarnesFrias.setBounds(10, 301, 198, 104);
		contentPane.add(panelCarnesFrias);
		panelCarnesFrias.setLayout(null);

		txtTipodeCarne = new JTextField();
		txtTipodeCarne.setColumns(10);
		txtTipodeCarne.setBounds(10, 26, 159, 20);
		panelCarnesFrias.add(txtTipodeCarne);

		JLabel lblTipoDeCarne = new JLabel("Tipo de Carne:");
		lblTipoDeCarne.setBounds(10, 11, 113, 14);
		panelCarnesFrias.add(lblTipoDeCarne);

		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(10, 72, 159, 20);
		panelCarnesFrias.add(txtPeso);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 57, 113, 14);
		panelCarnesFrias.add(lblPeso);

		panelComidaChatarra = new JPanel();
		panelComidaChatarra.setLayout(null);
		panelComidaChatarra.setBounds(10, 612, 230, 132);
		contentPane.add(panelComidaChatarra);

		JLabel lblTieneAzucar = new JLabel("¿Tiene Azucar?");
		lblTieneAzucar.setBounds(10, 11, 117, 14);
		panelComidaChatarra.add(lblTieneAzucar);

		listAzucarSioNo = new JList();
		listAzucarSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] { "Si", "No" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listAzucarSioNo.setForeground(Color.BLACK);
		listAzucarSioNo.setBounds(10, 26, 159, 39);
		panelComidaChatarra.add(listAzucarSioNo);

		JLabel lblTipoDeComida = new JLabel("Tipo De Comida:\r\n");
		lblTipoDeComida.setBounds(10, 76, 159, 14);
		panelComidaChatarra.add(lblTipoDeComida);

		txtTipoDeComidaChatarra = new JTextField();
		txtTipoDeComidaChatarra.setColumns(10);
		txtTipoDeComidaChatarra.setBounds(10, 91, 159, 20);
		panelComidaChatarra.add(txtTipoDeComidaChatarra);

		panelFrutaAcida = new JPanel();
		panelFrutaAcida.setLayout(null);
		panelFrutaAcida.setBounds(250, 612, 299, 238);
		contentPane.add(panelFrutaAcida);

		JLabel lblMx = new JLabel("1-10 (10 Máx ; 1 Min)");
		lblMx.setForeground(Color.RED);
		lblMx.setBounds(176, 146, 113, 14);
		panelFrutaAcida.add(lblMx);

		JLabel lblDeTemporada = new JLabel("Es de Temporada:");
		lblDeTemporada.setBounds(10, 11, 113, 14);
		panelFrutaAcida.add(lblDeTemporada);

		listTempSioNo = new JList();
		listTempSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] { "Si", "No" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listTempSioNo.setForeground(Color.DARK_GRAY);
		listTempSioNo.setBounds(10, 29, 159, 39);
		panelFrutaAcida.add(listTempSioNo);

		JLabel lblMetodoDeConserva = new JLabel("Metodo de Conservación:\r\n");
		lblMetodoDeConserva.setBounds(10, 79, 159, 14);
		panelFrutaAcida.add(lblMetodoDeConserva);

		txtMetodoDeConserva = new JTextField();
		txtMetodoDeConserva.setColumns(10);
		txtMetodoDeConserva.setBounds(10, 92, 159, 20);
		panelFrutaAcida.add(txtMetodoDeConserva);

		JLabel lblNivelDeAcidez = new JLabel("Nivel de Acidez");
		lblNivelDeAcidez.setBounds(10, 128, 113, 14);
		panelFrutaAcida.add(lblNivelDeAcidez);

		txtNivelDeAcidez = new JTextField();
		txtNivelDeAcidez.setColumns(10);
		txtNivelDeAcidez.setBounds(10, 143, 159, 20);
		panelFrutaAcida.add(txtNivelDeAcidez);

		JLabel lblSePuedenHacerJugos = new JLabel("Se Pueden hacer Jugos?");
		lblSePuedenHacerJugos.setBounds(10, 174, 159, 14);
		panelFrutaAcida.add(lblSePuedenHacerJugos);

		listJugosSioNo = new JList();
		listJugosSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] { "Si", "No" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJugosSioNo.setForeground(Color.DARK_GRAY);
		listJugosSioNo.setBounds(10, 188, 159, 39);
		panelFrutaAcida.add(listJugosSioNo);

		panelFrutaDulce = new JPanel();
		panelFrutaDulce.setLayout(null);
		panelFrutaDulce.setBounds(451, 599, 363, 266);
		contentPane.add(panelFrutaDulce);

		JLabel lblDeTemporada_1 = new JLabel("Es de Temporada:");
		lblDeTemporada_1.setBounds(10, 11, 113, 14);
		panelFrutaDulce.add(lblDeTemporada_1);

		listTempSioNoDulce = new JList();
		listTempSioNoDulce.setModel(new AbstractListModel() {
			String[] values = new String[] { "Si", "No" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listTempSioNoDulce.setForeground(Color.DARK_GRAY);
		listTempSioNoDulce.setBounds(10, 26, 159, 39);
		panelFrutaDulce.add(listTempSioNoDulce);

		JLabel lblMetodoDeConserva_1 = new JLabel("Metodo de Conservación:\r\n");
		lblMetodoDeConserva_1.setBounds(10, 76, 159, 14);
		panelFrutaDulce.add(lblMetodoDeConserva_1);

		txtMetodoConservaDulce = new JTextField();
		txtMetodoConservaDulce.setColumns(10);
		txtMetodoConservaDulce.setBounds(10, 97, 159, 20);
		panelFrutaDulce.add(txtMetodoConservaDulce);

		JLabel lblNivelDeAzucar = new JLabel("Nivel de Azucar");
		lblNivelDeAzucar.setBounds(10, 128, 113, 14);
		panelFrutaDulce.add(lblNivelDeAzucar);

		txtNivelDeAzucar = new JTextField();
		txtNivelDeAzucar.setColumns(10);
		txtNivelDeAzucar.setBounds(10, 150, 159, 20);
		panelFrutaDulce.add(txtNivelDeAzucar);

		JLabel lblSePuedenHacer = new JLabel("Se Pueden hacer Postres?");
		lblSePuedenHacer.setBounds(10, 181, 159, 14);
		panelFrutaDulce.add(lblSePuedenHacer);

		listPostresSioNoDulce = new JList();
		listPostresSioNoDulce.setModel(new AbstractListModel() {

			String[] values = new String[] { "Si", "No" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPostresSioNoDulce.setForeground(Color.DARK_GRAY);
		listPostresSioNoDulce.setBounds(10, 199, 159, 39);
		panelFrutaDulce.add(listPostresSioNoDulce);

		JLabel lblMx_1 = new JLabel("1-10 (10 Máx ; 1 Min)");
		lblMx_1.setForeground(Color.RED);
		lblMx_1.setBounds(173, 153, 113, 14);
		panelFrutaDulce.add(lblMx_1);

		panelLacteo = new JPanel();
		panelLacteo.setLayout(null);
		panelLacteo.setBounds(830, 14, 240, 99);
		contentPane.add(panelLacteo);

		txtTipoLacteo = new JTextField();
		txtTipoLacteo.setColumns(10);
		txtTipoLacteo.setBounds(0, 15, 159, 20);
		panelLacteo.add(txtTipoLacteo);

		JLabel lblTipoDeLacteo = new JLabel("Tipo De Lacteo:");
		lblTipoDeLacteo.setBounds(0, 0, 113, 14);
		panelLacteo.add(lblTipoDeLacteo);

		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(0, 61, 159, 20);
		panelLacteo.add(txtCantidad);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(0, 46, 113, 14);
		panelLacteo.add(lblCantidad);

		JLabel lblGrKgLt = new JLabel("GR, KG, LT");
		lblGrKgLt.setForeground(Color.RED);
		lblGrKgLt.setBounds(169, 64, 113, 14);
		panelLacteo.add(lblGrKgLt);

		panelNoLacteo = new JPanel();
		panelNoLacteo.setLayout(null);
		panelNoLacteo.setBounds(830, 125, 198, 98);
		contentPane.add(panelNoLacteo);

		txtTipoNoLacteo = new JTextField();
		txtTipoNoLacteo.setColumns(10);
		txtTipoNoLacteo.setBounds(0, 15, 159, 20);
		panelNoLacteo.add(txtTipoNoLacteo);

		JLabel lblTipoDeNoLacteo = new JLabel("Tipo De No Lacteo");
		lblTipoDeNoLacteo.setBounds(0, 0, 113, 14);
		panelNoLacteo.add(lblTipoDeNoLacteo);

		txtOrigenAnimal = new JTextField();
		txtOrigenAnimal.setColumns(10);
		txtOrigenAnimal.setBounds(0, 61, 159, 20);
		panelNoLacteo.add(txtOrigenAnimal);

		JLabel lblOrigenAnimal = new JLabel("Origen Animal");
		lblOrigenAnimal.setBounds(0, 46, 113, 14);
		panelNoLacteo.add(lblOrigenAnimal);

		panelVerduras = new JPanel();
		panelVerduras.setLayout(null);
		panelVerduras.setBounds(830, 234, 218, 120);
		contentPane.add(panelVerduras);

		txtTipoVerdura = new JTextField();
		txtTipoVerdura.setColumns(10);
		txtTipoVerdura.setBounds(0, 15, 159, 20);
		panelVerduras.add(txtTipoVerdura);

		JLabel lblTipoDeVerdura = new JLabel("Tipo De Verdura:");
		lblTipoDeVerdura.setBounds(0, 0, 113, 14);
		panelVerduras.add(lblTipoDeVerdura);

		txtPesoVerduras = new JTextField();
		txtPesoVerduras.setColumns(10);
		txtPesoVerduras.setBounds(0, 61, 159, 20);
		panelVerduras.add(txtPesoVerduras);

		JLabel lblPeso_1 = new JLabel("Peso:");
		lblPeso_1.setBounds(0, 46, 113, 14);
		panelVerduras.add(lblPeso_1);
		
		lblCreadoConExtio = new JLabel("");
		lblCreadoConExtio.setForeground(Color.RED);
		lblCreadoConExtio.setBounds(10, 534, 297, 14);
		contentPane.add(lblCreadoConExtio);
		
		lblCreadoConExtio.setVisible(false);
		panelCarnesFrias.setVisible(false);
		panelComidaChatarra.setVisible(false);
		panelFrutaAcida.setVisible(false);
		panelFrutaDulce.setVisible(false);
		panelLacteo.setVisible(false);
		panelNoLacteo.setVisible(false);
		panelVerduras.setVisible(false);

	}
}
