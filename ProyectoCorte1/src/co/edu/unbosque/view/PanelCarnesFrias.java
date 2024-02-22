package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelCarnesFrias extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTipodeCarne;
	private JTextField txtPeso;
	public PanelCarnesFrias() {
		setBounds(new Rectangle(0, 0, 346, 257));
		setLayout(null);
		
		txtTipodeCarne = new JTextField();
		txtTipodeCarne.setColumns(10);
		txtTipodeCarne.setBounds(0, 15, 159, 20);
		add(txtTipodeCarne);
		
		JLabel lblTipoDeCarne = new JLabel("Tipo de Carne:");
		lblTipoDeCarne.setBounds(0, 0, 113, 14);
		add(lblTipoDeCarne);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(0, 61, 159, 20);
		add(txtPeso);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(0, 46, 113, 14);
		add(lblPeso);
		
	}

}
