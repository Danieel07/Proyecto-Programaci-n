package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import java.awt.Rectangle;

public class PanelFrutaAcida extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMetodoDeConserva;
	private JTextField txtNivelAcidez;

	public PanelFrutaAcida() {
		setBounds(new Rectangle(0, 0, 346, 247));
		setLayout(null);
		
		JLabel lblDeTemporada = new JLabel("Es de Temporada:");
		lblDeTemporada.setBounds(0, 0, 113, 14);
		add(lblDeTemporada);
		
		JList listTempSioNo = new JList();
		listTempSioNo.setModel(new AbstractListModel() {
			String[] values = new String[] {"Si ", "No"};
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
		
		txtMetodoDeConserva = new JTextField();
		txtMetodoDeConserva.setColumns(10);
		txtMetodoDeConserva.setBounds(0, 80, 159, 20);
		add(txtMetodoDeConserva);
		
		JLabel lblNivelDeAcidez = new JLabel("Nivel de Acidez");
		lblNivelDeAcidez.setBounds(0, 113, 113, 14);
		add(lblNivelDeAcidez);
		
		txtNivelAcidez = new JTextField();
		txtNivelAcidez.setColumns(10);
		txtNivelAcidez.setBounds(0, 138, 159, 20);
		add(txtNivelAcidez);
		
		JLabel lblSePuedenHacerJugos = new JLabel("Se Pueden hacer Jugos?");
		lblSePuedenHacerJugos.setBounds(0, 169, 159, 14);
		add(lblSePuedenHacerJugos);
		
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
		listJugosSioNo.setBounds(0, 194, 159, 39);
		add(listJugosSioNo);
		
		JLabel lblMx = new JLabel("1-10 (10 Máx ; 1 Min)");
		lblMx.setForeground(Color.RED);
		lblMx.setBounds(169, 141, 113, 14);
		add(lblMx);

	}

}
