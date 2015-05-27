package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ComprobacionPane extends JPanel {
	private JTextField textFieldID;
	private JTextField textFieldApellido;

	public ComprobacionPane() {
		this.setBounds(0,0,850,599);
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(190, 125, 71, 34);
		add(lblId);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblerApellido.setBounds(433, 125, 118, 34);
		add(lblerApellido);
		
		textFieldID = new JTextField();
		textFieldID.setEnabled(false);
		textFieldID.setBounds(176, 163, 147, 20);
		add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setEnabled(false);
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(443, 163, 147, 20);
		add(textFieldApellido);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(176, 214, 447, 44);
		add(btnComprobar);
	}
}
