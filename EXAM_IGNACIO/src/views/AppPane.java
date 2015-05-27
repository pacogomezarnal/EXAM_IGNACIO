package views;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;

import Modelo.IngresoLaby;
import Modelo.ModeloJugadores;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppPane extends JPanel {
	private JTextField textFieldNombre;
	private JTextField textFieldID;
	private JTextField textFieldApellido1;
	private JTextField textFieldEdad;
	private JTextField textFieldNacionalidad;
	private AppFrame app;
	IngresoLaby laby;
	ModeloJugadores modJug;

	/**
	 * Create the panel.
	 */
	public AppPane() {
		this.setBounds(0,0,850,599);
		setLayout(null);
		
		Image imgAvatar = new ImageIcon(this.getClass().getResource("/Nacho.jpg")).getImage();
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(imgAvatar));
		logo.setBounds(62, 60, 232, 228);
		add(logo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(346, 69, 104, 36);
		add(lblNombre);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(557, 69, 67, 36);
		add(lblId);
		
		JLabel lblApellido1 = new JLabel("1er Apellido:");
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido1.setBounds(346, 187, 183, 36);
		add(lblApellido1);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(346, 296, 183, 36);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNacionalidad.setBounds(346, 410, 183, 36);
		add(lblNacionalidad);
		
		modJug= new ModeloJugadores();
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setBounds(342, 112, 160, 27);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		String[] datosJugador=modJug.getJugador().toArray(new String[modJug.getJugador().size()]);
		textFieldNombre.setText("");
		
		textFieldID = new JTextField();
		textFieldID.setEditable(false);
		textFieldID.setColumns(10);
		textFieldID.setBounds(536, 112, 160, 27);
		add(textFieldID);
		
		textFieldApellido1 = new JTextField();
		textFieldApellido1.setEditable(false);
		textFieldApellido1.setColumns(10);
		textFieldApellido1.setBounds(342, 234, 160, 27);
		add(textFieldApellido1);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(342, 343, 160, 27);
		add(textFieldEdad);
		
		textFieldNacionalidad = new JTextField();
		textFieldNacionalidad.setEditable(false);
		textFieldNacionalidad.setColumns(10);
		textFieldNacionalidad.setBounds(346, 457, 160, 27);
		add(textFieldNacionalidad);
		
		textFieldID.setText(datosJugador[0]);
		textFieldNombre.setText(datosJugador[1]);
		textFieldApellido1.setText(datosJugador[2]);
		textFieldEdad.setText(datosJugador[3]);
		textFieldNacionalidad.setText(datosJugador[4]);
		
		JLabel lblMensaje = new JLabel("No hab\u00EDa otra foto");
		lblMensaje.setBounds(49, 299, 104, 14);
		add(lblMensaje);
		
	}
}
