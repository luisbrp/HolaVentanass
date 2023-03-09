package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EliminarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCodigo;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EliminarUsuario dialog = new EliminarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EliminarUsuario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setBounds(66, 65, 93, 27);
			contentPanel.add(lblCodigo);
		}
		
		textCodigo = new JTextField();
		textCodigo.setBounds(139, 65, 225, 27);
		contentPanel.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(158, 193, 93, 37);
		contentPanel.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(291, 193, 93, 37);
		contentPanel.add(btnCancelar);
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
}
