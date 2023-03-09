package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModificarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombreApellido;
	private JTextField textDni;
	private JTextField textCodigo;
	private JButton btnCancelar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarUsuario dialog = new ModificarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarUsuario() {
		setBounds(100, 100, 606, 364);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(48, 51, 108, 28);
		contentPanel.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(179, 51, 217, 28);
		contentPanel.add(textCodigo);
		textCodigo.setColumns(10);
		
		JLabel lblNombreApellido = new JLabel("Nombre y Apellido:");
		lblNombreApellido.setBounds(48, 116, 108, 28);
		contentPanel.add(lblNombreApellido);
		
		textNombreApellido = new JTextField();
		textNombreApellido.setColumns(10);
		textNombreApellido.setBounds(179, 116, 217, 28);
		contentPanel.add(textNombreApellido);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(48, 181, 108, 28);
		contentPanel.add(lblDni);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(179, 185, 217, 28);
		contentPanel.add(textDni);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(307, 254, 89, 41);
		contentPanel.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(440, 254, 89, 41);
		contentPanel.add(btnCancelar);
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setTextDni(JTextField textDni) {
		this.textDni = textDni;
	}

	public JTextField getTextNombreApellido() {
		return textNombreApellido;
	}

	public JTextField getTextDni() {
		return textDni;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}
}
