package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GestorActividades;
import vista.GestorUsuarios;

public class ControladorActividades implements ActionListener {

	private GestorActividades ventanaGestorActividades;

	
	public ControladorActividades (GestorActividades gestorActividades) {
		this.ventanaGestorActividades = gestorActividades;
		
		ventanaGestorActividades.getBtnInsertar().addActionListener(this);
		ventanaGestorActividades.getBtnEliminar().addActionListener(this);
		ventanaGestorActividades.getBtnInsertar().addActionListener(this);
	}
	
	public void inicializar() {
		ventanaGestorActividades.setTitle("Actividades");
		ventanaGestorActividades.setLocationRelativeTo(null);
		ventanaGestorActividades.setVisible(false);
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
