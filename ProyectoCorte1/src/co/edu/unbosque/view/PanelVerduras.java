package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelVerduras extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	
	public PanelVerduras() {
		setBounds(new Rectangle(0, 0, 346, 247));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 15, 159, 20);
		textField.setColumns(10);
		add(textField);
		
		JLabel lblTipoDeVerdura = new JLabel("Tipo De Verdura:");
		lblTipoDeVerdura.setBounds(0, 0, 113, 14);
		add(lblTipoDeVerdura);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(0, 61, 159, 20);
		add(textField_1);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(0, 46, 113, 14);
		add(lblPeso);

	}

}
