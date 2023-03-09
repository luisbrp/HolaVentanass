package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modelo.Conector;
import modelo.ModeloUsuario;
import modelo.Usuario;
import vista.EliminarUsuario;
import vista.GestorUsuarios;
import vista.InsertarUsuario;
import vista.Menu;
import vista.ModificarUsuario;

public class ControladorUsuarios implements ActionListener{
	
	private GestorUsuarios ventanaGestorUsuario;
	 

	public ControladorUsuarios (GestorUsuarios gestorUsuario) {
		this.ventanaGestorUsuario = gestorUsuario;
		
		ventanaGestorUsuario.getBtnInsertar().addActionListener(this);
		ventanaGestorUsuario.getBtnEliminar().addActionListener(this);
		ventanaGestorUsuario.getBtnModificar().addActionListener(this);
		ventanaGestorUsuario.getCancelButton().addActionListener(this);
		
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
			
		} else if(e.getSource() == ventanaGestorUsuario.getBtnEliminar()) {
			
			EliminarUsuario  ventanaEliminarUsuario = new EliminarUsuario();
			ControladorEliminar controladorEliminar = new ControladorEliminar(ventanaEliminarUsuario);
			
			controladorEliminar.inicializar();
			
			ventanaEliminarUsuario.setVisible(true);
			
		} else if (e.getSource() == ventanaGestorUsuario.getBtnModificar()) {
			
			ModificarUsuario ventanaModificarUsuario = new ModificarUsuario();
			ControladorModificar controladorModificar = new ControladorModificar(ventanaModificarUsuario);
			
			controladorModificar.inicializar();
			
			ventanaModificarUsuario.setVisible(true);
			
		} else if (e.getSource() == ventanaGestorUsuario.getCancelButton()) {
			ventanaGestorUsuario.dispose();
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
			    	ModeloUsuario mUsuario = new ModeloUsuario();
			      
			        String nombreApellido = ventanaInsertarUsuario.getTextNombreApellido().getText();
			        usuario.setNombre_apellido(nombreApellido);
			        
			        String dni = ventanaInsertarUsuario.getTextDni().getText();
			        usuario.setDni(dni);
			        
			        String codigo = ventanaInsertarUsuario.getTextCodigo().getText();
			        usuario.setCodigo(codigo);
			        
		        	 mUsuario.conectar();
		        	 mUsuario.insertarUsuario(usuario);
		        	 mUsuario.cerrar();
		        	 
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		        
		    } if (e.getSource() == ventanaInsertarUsuario.getBtnCancelar()) {
		    	ventanaInsertarUsuario.dispose();
		    }
		    	
		  }
	 }
	public class ControladorModificar extends Conector implements ActionListener{
		
		private ModificarUsuario ventanaModificarUsuario;
		
		public ControladorModificar (ModificarUsuario modificarUsuario) {
			this.ventanaModificarUsuario = modificarUsuario;
			
			ventanaModificarUsuario.getBtnGuardar().addActionListener(this);
			ventanaModificarUsuario.getBtnCancelar().addActionListener(this);
		}
		
		public void inicializar() {
			ventanaGestorUsuario.setTitle("Modificar Usuarios");
			ventanaGestorUsuario.setLocationRelativeTo(null);
			ventanaGestorUsuario.setVisible(false);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == ventanaModificarUsuario.getBtnGuardar()) {
		        
		    	try {
		    		
		    		Usuario usuario = new Usuario();
			        ModeloUsuario mUsuario = new ModeloUsuario();
			      
			        String codigo = ventanaModificarUsuario.getTextCodigo().getText();
			        usuario.setCodigo(codigo);
			        
			        String nombreApellido = ventanaModificarUsuario.getTextNombreApellido().getText();
			        usuario.setNombre_apellido(nombreApellido);
			        
			        String dni = ventanaModificarUsuario.getTextDni().getText();
			        usuario.setDni(dni);
			        
		        	mUsuario.conectar();
		        	mUsuario.modificarUsuario(codigo, usuario);
		        	Menu.UsuarioModificado();
		        	mUsuario.cerrar();
			    	
		        	 
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		        
		    } if (e.getSource() == ventanaModificarUsuario.getBtnCancelar()) {
		    	ventanaModificarUsuario.dispose();
		    }
		    	
		    }
		}
		
		public class ControladorEliminar extends Conector implements ActionListener {

			private EliminarUsuario ventanaEliminarUsuario;
			
			public ControladorEliminar (EliminarUsuario eliminarUsuario){
				this.ventanaEliminarUsuario = eliminarUsuario;
				
				ventanaEliminarUsuario.getBtnGuardar().addActionListener(this);
				ventanaEliminarUsuario.getBtnCancelar().addActionListener(this);
			}
			
			public void inicializar() {
				ventanaGestorUsuario.setTitle("Eliminar Usuarios");
				ventanaGestorUsuario.setLocationRelativeTo(null);
				ventanaGestorUsuario.setVisible(false);
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 if(e.getSource() == ventanaEliminarUsuario.getBtnGuardar()) {
				
				 try {
					 
					Usuario usuario = new Usuario();
					ModeloUsuario mUsuario = new ModeloUsuario();
					 
					String codigo = ventanaEliminarUsuario.getTextCodigo().getText();
					usuario.setCodigo(codigo);
					 
					mUsuario.conectar(); 
					mUsuario.EliminarUsuario(codigo);
					Menu.UsuarioEliminado();
					mUsuario.cerrar();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				 
			} if (e.getSource() == ventanaEliminarUsuario.getBtnCancelar()) {
				ventanaEliminarUsuario.dispose();
			}
			
		}
	}

}
