package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnInsertar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorUsuarios dialog = new GestorUsuarios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBounds(169, 161, 89, 23);
			contentPanel.add(btnModificar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(169, 92, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			btnInsertar = new JButton("Insertar");
			btnInsertar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnInsertar.setBounds(169, 37, 89, 23);
			contentPanel.add(btnInsertar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JButton getBtnInsertar() {
		return btnInsertar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

}
