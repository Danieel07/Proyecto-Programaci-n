package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;

public class PanelFrutaDulce extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PanelFrutaDulce() {
		setBounds(new Rectangle(0, 0, 346, 257));
		setLayout(null);
		
		JLabel lblDeTemporada = new JLabel("Es de Temporada:");
		lblDeTemporada.setBounds(0, 0, 113, 14);
		add(lblDeTemporada);
		
		JList listTempSioNo = new JList();
		listTempSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] {"Si", "No"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listTempSioNo.setForeground(Color.DARK_GRAY);
		listTempSioNo.setBounds(0, 15, 159, 39);
		add(listTempSioNo);
		
		JLabel lblMetodoDeConserva = new JLabel("Metodo de Conservación:\r\n");
		lblMetodoDeConserva.setBounds(0, 65, 159, 14);
		add(lblMetodoDeConserva);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(0, 86, 159, 20);
		add(textField);
		
		JLabel lblNivelDeAzucar = new JLabel("Nivel de Azucar");
		lblNivelDeAzucar.setBounds(0, 117, 113, 14);
		add(lblNivelDeAzucar);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(0, 139, 159, 20);
		add(textField_1);
		
		JLabel lblMx = new JLabel("1-10 (10 Máx ; 1 Min)");
		lblMx.setForeground(Color.RED);
		lblMx.setBounds(169, 142, 113, 14);
		add(lblMx);
		
		JLabel lblSePuedenHacer = new JLabel("Se Pueden hacer Postres?");
		lblSePuedenHacer.setBounds(0, 170, 159, 14);
		add(lblSePuedenHacer);
		
		JList listJugosSioNo = new JList();
		listJugosSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] {"Si", "No"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJugosSioNo.setForeground(Color.DARK_GRAY);
		listJugosSioNo.setBounds(0, 188, 159, 39);
		add(listJugosSioNo);

	}

}
