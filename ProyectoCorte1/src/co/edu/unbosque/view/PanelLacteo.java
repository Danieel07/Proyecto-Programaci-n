package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class PanelLacteo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTipoDeLacteo;
	private JTextField txtCantidad;

	public PanelLacteo() {
		setBounds(new Rectangle(0, 0, 346, 257));
		setLayout(null);
		
		txtTipoDeLacteo = new JTextField();
		txtTipoDeLacteo.setColumns(10);
		txtTipoDeLacteo.setBounds(0, 15, 159, 20);
		add(txtTipoDeLacteo);
		
		JLabel lblTipoDeLacteo = new JLabel("Tipo De Lacteo:");
		lblTipoDeLacteo.setBounds(0, 0, 113, 14);
		add(lblTipoDeLacteo);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(0, 61, 159, 20);
		add(txtCantidad);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(0, 46, 113, 14);
		add(lblCantidad);
		
		JLabel lblGrKgLt = new JLabel("GR, KG, LT");
		lblGrKgLt.setForeground(Color.RED);
		lblGrKgLt.setBounds(169, 64, 113, 14);
		add(lblGrKgLt);

	}

}
