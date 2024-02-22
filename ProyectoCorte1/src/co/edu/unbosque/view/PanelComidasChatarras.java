package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;

public class PanelComidasChatarras extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTipoDeComida;
	
	public PanelComidasChatarras() {
		setLayout(null);
		
		JLabel lblTieneAzucar = new JLabel("¿Tiene Azucar?");
		lblTieneAzucar.setBounds(0, 0, 117, 14);
		add(lblTieneAzucar);
		
		JList listAzucarSioNo = new JList();
		listAzucarSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] {"Si", "No"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listAzucarSioNo.setForeground(Color.BLACK);
		listAzucarSioNo.setBounds(0, 15, 159, 39);
		add(listAzucarSioNo);
		
		JLabel lblTipoDeComida = new JLabel("Tipo De Comida:\r\n");
		lblTipoDeComida.setBounds(0, 65, 159, 14);
		add(lblTipoDeComida);
		
		txtTipoDeComida = new JTextField();
		txtTipoDeComida.setColumns(10);
		txtTipoDeComida.setBounds(0, 80, 159, 20);
		add(txtTipoDeComida);

	}

}
