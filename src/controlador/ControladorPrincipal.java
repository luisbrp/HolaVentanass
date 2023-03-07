package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GestorUsuarios;
import vista.GestorActividades;
import vista.GestorInscripciones;
import vista.principal;

public class ControladorPrincipal implements ActionListener {
		private principal ventanaPrincipal;
		
		public ControladorPrincipal (principal principal) {
			this.ventanaPrincipal = principal;
			
			ventanaPrincipal.getBtnGestionarSocios().addActionListener(this);
			ventanaPrincipal.getBtnGestionarActividades().addActionListener(this);
			ventanaPrincipal.getBtnGestionarInscripciones().addActionListener(this);
		}

		
		public void inicializar() {
			ventanaPrincipal.setTitle("Desktop");
			ventanaPrincipal.setLocationRelativeTo(null);
			ventanaPrincipal.setVisible(false);
		}
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == ventanaPrincipal.getBtnGestionarSocios()) {
				GestorUsuarios gestorUsuario = new GestorUsuarios();
				
				ControladorUsuarios cu = new ControladorUsuarios(gestorUsuario);
				cu.inicializar();
				
				gestorUsuario.setVisible(true);
		
			}
			if(e.getSource() == ventanaPrincipal.getBtnGestionarActividades()) {
				GestorActividades gestorActividades = new GestorActividades();
				
				ControladorActividades ca = new ControladorActividades(gestorActividades);
				ca.inicializar();
				
				gestorActividades.setVisible(true);
			}
			if(e.getSource() == ventanaPrincipal.getBtnGestionarInscripciones()) {
				GestorInscripciones gi = new GestorInscripciones();
		        gi.setDefaultCloseOperation(GestorInscripciones.DISPOSE_ON_CLOSE);
		        gi.setVisible(true);
			}
		}
}
