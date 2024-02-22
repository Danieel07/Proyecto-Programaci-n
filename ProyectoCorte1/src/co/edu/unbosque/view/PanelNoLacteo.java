package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelNoLacteo extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTipoDeNoLacteo;
	private JTextField txtOrigenAnimal;
	public PanelNoLacteo() {
		setBounds(new Rectangle(0, 0, 356, 247));
		setLayout(null);
		
		txtTipoDeNoLacteo = new JTextField();
		txtTipoDeNoLacteo.setColumns(10);
		txtTipoDeNoLacteo.setBounds(0, 15, 159, 20);
		add(txtTipoDeNoLacteo);
		
		JLabel lblTipoDeNoLacteo = new JLabel("Tipo De No Lacteo");
		lblTipoDeNoLacteo.setBounds(0, 0, 113, 14);
		add(lblTipoDeNoLacteo);
		
		txtOrigenAnimal = new JTextField();
		txtOrigenAnimal.setColumns(10);
		txtOrigenAnimal.setBounds(0, 61, 159, 20);
		add(txtOrigenAnimal);
		
		JLabel lblOrigenAnimal = new JLabel("Origen Animal");
		lblOrigenAnimal.setBounds(0, 46, 113, 14);
		add(lblOrigenAnimal);

	}
}
