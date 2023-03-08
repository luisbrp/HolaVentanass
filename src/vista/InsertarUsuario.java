package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsertarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombreApellido;
	private JTextField textDni;
	private JTextField textCodigo;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InsertarUsuario dialog = new InsertarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InsertarUsuario() {
		setBounds(100, 100, 681, 411);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombreApellido = new JLabel("Nombre y Apellido:");
		lblNombreApellido.setBounds(36, 51, 135, 35);
		contentPanel.add(lblNombreApellido);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(66, 112, 64, 35);
		contentPanel.add(lblDni);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(66, 167, 64, 35);
		contentPanel.add(lblCodigo);
		
		textNombreApellido = new JTextField();
		textNombreApellido.setColumns(10);
		textNombreApellido.setBounds(170, 51, 293, 35);
		contentPanel.add(textNombreApellido);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(170, 112, 293, 35);
		contentPanel.add(textDni);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(170, 167, 293, 35);
		contentPanel.add(textCodigo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(361, 308, 89, 41);
		contentPanel.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(490, 308, 89, 41);
		contentPanel.add(btnCancelar);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public JTextField getTextNombreApellido() {
		return textNombreApellido;
	}

	public void setTextNombreApellido(JTextField textNombreApellido) {
		this.textNombreApellido = textNombreApellido;
	}

	public JTextField getTextDni() {
		return textDni;
	}

	public void setTextDni(JTextField textDni) {
		this.textDni = textDni;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}
}
