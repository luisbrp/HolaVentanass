package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GestorActividades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnInsertar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorActividades dialog = new GestorActividades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorActividades() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnInsertar = new JButton("Insertar");
			btnInsertar.setBounds(172, 10, 89, 23);
			contentPanel.add(btnInsertar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(172, 77, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBounds(172, 161, 89, 23);
			contentPanel.add(btnModificar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnInsertar() {
		return btnInsertar;
	}

}
