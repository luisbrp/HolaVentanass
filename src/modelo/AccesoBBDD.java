package modelo;


import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Actividad;
import modelo.Usuario;
import vista.Menu;
import vista.Visor;
/**
 * 
 * @author irakasle
 *	todos los métodos que accedan a la BBDD estarán aqui
 *	en esta clase no tiene que haber ningun Scanner ni System.ou.println
 */
	public class AccesoBBDD extends Conector{

	PreparedStatement pst;
	ResultSet rs;
	
	public boolean comprobarCodigo(String codigo) throws SQLException {
		
		boolean esta = false;
		Usuario usuario = getUsuario(codigo);
		if (usuario != null && usuario.getCodigo() != null && usuario.getCodigo().equals(codigo)) {
		    esta = true;
		}
			return esta;
	}
	
	public void insertarUsuario (Usuario usuario) throws SQLException  {
		String codigo = usuario.getCodigo();
		if (comprobarCodigo(codigo)) {
			Menu.menuDuplicado();
		}  else  {
			
			pst = conexion.prepareStatement("INSERT INTO usuarios (nombre_apellido, dni, codigo) VALUES (?,?,?)");
			
			pst.setString(1, usuario.getNombre_apellido());
			pst.setString(2, usuario.getDni());
			pst.setString(3, codigo);
			
			pst.execute();
			
			Menu.usuarioOk();
		}
	}
	
	public Usuario getUsuario(String codigo) throws SQLException {
		
		
		Usuario usuario = new Usuario();
		pst = conexion.prepareStatement("SELECT * FROM usuarios WHERE codigo =?");
		
		pst.setString(1, codigo);
		pst.executeQuery();
		
		rs = pst.executeQuery();
		while (rs.next()) {
			usuario.setId(rs.getInt(1));
			usuario.setNombre_apellido(rs.getString(2));
			usuario.setDni(rs.getString(3));
			usuario.setCodigo(rs.getString(4));
		}
		
		return usuario;
	}
	
	
	
	
	
	
	
	public ArrayList<Usuario> getUsuarios ( ) throws SQLException {
		ArrayList<Usuario> usuarios  = new ArrayList<Usuario>();
		
		pst = conexion.prepareStatement("SELECT * FROM usuarios");
		
		pst.executeQuery();
		
		rs = pst.executeQuery();
		Usuario usuario = new Usuario();
		while (rs.next()) {
			usuario.setId(rs.getInt(1));
			usuario.setNombre_apellido(rs.getString(2));
			usuario.setDni(rs.getString(3));
			usuario.setCodigo(rs.getString(4));
			usuarios.add(usuario);
		}
		
		return usuarios;
		
	}
	
	public ArrayList<Usuario> getUsuariosPorActividad (int id) throws SQLException {
		ArrayList<Usuario> usuarios  = new ArrayList<Usuario>();
		
		pst = conexion.prepareStatement("SELECT usuarios.* FROM usuarios INNER JOIN inscripciones ON usuarios.id = inscripciones.id_usuario WHERE inscripciones.id_actividad = ?");
		pst.setInt(1, id);
		pst.executeQuery();
		
		rs = pst.executeQuery();
		Usuario usuario = new Usuario();
		while (rs.next()) {
			usuario.setId(rs.getInt(1));
			usuario.setNombre_apellido(rs.getString(2));
			usuario.setDni(rs.getString(3));
			usuario.setCodigo(rs.getString(4));
			usuarios.add(usuario);
		}
		
		return usuarios;
	}
	
	
	// actividad
	
	public void modificarActividad (Actividad actividad , int id) throws SQLException {
		
		pst = conexion.prepareStatement("UPDATE actividades SET dias_semana = ? WHERE id = ?");
		
		pst.setString(1, actividad.getDias_semana());
		pst.setInt(2, id);
		
		pst.executeUpdate();
		
		Menu.actividadOK();
		
	}
	

}
