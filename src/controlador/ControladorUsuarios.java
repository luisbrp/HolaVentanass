package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GestorUsuarios;

public class ControladorUsuarios implements ActionListener{
	private GestorUsuarios ventanaGestorUsuario;
	


	

	public ControladorUsuarios (GestorUsuarios gestorUsuario) {
		this.ventanaGestorUsuario = gestorUsuario;
		
		ventanaGestorUsuario.getBtnInsertar().addActionListener(this);
		ventanaGestorUsuario.getBtnEliminar().addActionListener(this);
		ventanaGestorUsuario.getBtnInsertar().addActionListener(this);
	}
	
	public void inicializar() {
		ventanaGestorUsuario.setTitle("Usuarios");
		ventanaGestorUsuario.setLocationRelativeTo(null);
		ventanaGestorUsuario.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
