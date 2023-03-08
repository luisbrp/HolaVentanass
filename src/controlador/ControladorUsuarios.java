package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import modelo.AccesoBBDD;
import modelo.Conector;
import modelo.Usuario;
import vista.GestorUsuarios;
import vista.InsertarUsuario;

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
		if(e.getSource() == ventanaGestorUsuario.getBtnInsertar()) {
			InsertarUsuario ventanaInsertarUsuario = new InsertarUsuario();
			
			ControladorInsertar controladorInsertar = new ControladorInsertar(ventanaInsertarUsuario);
			
			controladorInsertar.inicializar();
			
			ventanaInsertarUsuario.setVisible(true);
		}
		
	}
	
	public class ControladorInsertar extends Conector implements ActionListener{
		
		private InsertarUsuario ventanaInsertarUsuario;
		
		public ControladorInsertar (InsertarUsuario insertarUsuario) {
			this.ventanaInsertarUsuario = insertarUsuario;
			
			ventanaInsertarUsuario.getBtnGuardar().addActionListener(this);
			ventanaInsertarUsuario.getBtnCancelar().addActionListener(this);
		}
		
		public void inicializar() {
			ventanaGestorUsuario.setTitle("Insertar Usuarios");
			ventanaGestorUsuario.setLocationRelativeTo(null);
			ventanaGestorUsuario.setVisible(false);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == ventanaInsertarUsuario.getBtnGuardar()) {
		        try {
					
			    	Usuario usuario = new Usuario();
			        AccesoBBDD bbdd = new AccesoBBDD();
			      
			        String nombreApellido = ventanaInsertarUsuario.getTextNombreApellido().getText();
			        usuario.setNombre_apellido(nombreApellido);
			        
			        String dni = ventanaInsertarUsuario.getTextDni().getText();
			        usuario.setDni(dni);
			        
			        String codigo = ventanaInsertarUsuario.getTextCodigo().getText();
			        usuario.setCodigo(codigo);
			        
		        	 bbdd.conectar();
		        	 bbdd.insertarUsuario(usuario);
		        	 bbdd.cerrar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		    }
		}
	}

}
