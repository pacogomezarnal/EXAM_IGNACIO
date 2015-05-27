package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class perfilEquipoPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public perfilEquipoPane() {
		setBounds(1,1,800,600);
		setLayout(null);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEquipo.setBounds(53, 48, 113, 33);
		add(lblEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(327, 48, 113, 33);
		add(lblNombre);
		
		JLabel lblApellido1 = new JLabel("1er Apellido");
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido1.setBounds(327, 157, 155, 33);
		add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("2\u00BA Apellido");
		lblApellido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido2.setBounds(327, 256, 155, 33);
		add(lblApellido2);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(327, 378, 155, 33);
		add(lblNacionalidad);
		
		JLabel lblID = new JLabel("Id");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblID.setBounds(541, 48, 84, 33);
		add(lblID);
		
		JTextPane textPaneNombre = new JTextPane();
		textPaneNombre.setBounds(293, 92, 147, 27);
		add(textPaneNombre);
		
		JTextPane textPaneApellido1 = new JTextPane();
		textPaneApellido1.setBounds(293, 201, 147, 27);
		add(textPaneApellido1);
		
		JTextPane textPaneApellido2 = new JTextPane();
		textPaneApellido2.setBounds(293, 300, 147, 27);
		add(textPaneApellido2);
		
		JTextPane textPaneNacionalidad = new JTextPane();
		textPaneNacionalidad.setBounds(293, 422, 147, 27);
		add(textPaneNacionalidad);
		
		JTextPane textPaneID = new JTextPane();
		textPaneID.setBounds(531, 92, 147, 27);
		add(textPaneID);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(19, 85, 147, 34);
		add(comboBox);
	}
}
