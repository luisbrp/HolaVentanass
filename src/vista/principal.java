package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class principal extends JFrame {

	private JPanel contentPane;
	private JButton btnGestionarActividades;
	private JButton btnGestionarSocios;
	private JButton btnGestionarInscripciones;

	/**
	 * Create the frame.
	 */
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnGestionarInscripciones = new JButton("GestionarInscripciones");
		btnGestionarInscripciones.setBounds(172, 246, 169, 53);
		contentPane.add(btnGestionarInscripciones);
		
		btnGestionarActividades = new JButton("GestionarActividades");
		btnGestionarActividades.setBounds(172, 147, 169, 53);
		contentPane.add(btnGestionarActividades);
		
		btnGestionarSocios = new JButton("GestionarSocios");
		btnGestionarSocios.setBounds(172, 42, 169, 53);
		contentPane.add(btnGestionarSocios);
	}

	public JButton getBtnGestionarActividades() {
		return btnGestionarActividades;
	}

	public JButton getBtnGestionarSocios() {
		return btnGestionarSocios;
	}

	public JButton getBtnGestionarInscripciones() {
		return btnGestionarInscripciones;
	}

}
