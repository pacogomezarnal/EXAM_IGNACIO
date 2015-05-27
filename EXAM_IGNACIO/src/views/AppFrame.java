package views;

import javax.swing.JFrame;

import views.perfilEquipoPane;

import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppFrame extends JFrame {


	private contentPaneApp contentPane;
	private AppPane app;
	private perfilEquipoPane perfil;
	private ComprobacionPane compPane;
	private JButton btnSiguiente;
	JButton btnAtras = new JButton("<< Atras");
	private JButton buttonAtras2;
	

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new contentPaneApp();
		setContentPane(contentPane);
		
		perfil=new perfilEquipoPane();
		app=new AppPane();
		compPane=new ComprobacionPane();
		
		contentPane.add(app);
		app.setLayout(null);
		
		contentPane.add(app, "principal");
		perfil.setLayout(null);
		
		contentPane.add(perfil, "perfil");
		
		contentPane.add(compPane, "comprobacion");
		
		buttonAtras2 = new JButton("<< Atras");
		buttonAtras2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "perfil");
			}
		});
		buttonAtras2.setBounds(119, 504, 116, 23);
		compPane.add(buttonAtras2);
		
		
		
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "principal");
			}
		});
		btnAtras.setBounds(44, 513, 89, 23);
		perfil.add(btnAtras);
		
		JButton buttonSiguiente2 = new JButton("Siguiente >>");
		buttonSiguiente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "comprobacion");
			}
		});
		buttonSiguiente2.setBounds(600, 513, 135, 23);
		perfil.add(buttonSiguiente2);
		app.setLayout(null);
		
		btnSiguiente = new JButton("Siguiente  >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)contentPane.getLayout();
				c.show(contentPane, "perfil");
			}
		});
		btnSiguiente.setBounds(587, 503, 109, 23);
		app.add(btnSiguiente);
		
		
	}
}
