package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vista.Menu;

public class ModeloUsuario extends Conector{

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
			Menu.UsuarioCodigo();
		}  else  {
			
			pst = conexion.prepareStatement("INSERT INTO usuarios (nombre_apellido, dni, codigo) VALUES (?,?,?)");
			
			pst.setString(1, usuario.getNombre_apellido());
			pst.setString(2, usuario.getDni());
			pst.setString(3, codigo);
			
			pst.execute();
			
			Menu.usuarioRegistrado();
		}
	}
	
	public void EliminarUsuario (String codigo) throws SQLException {
		
		Usuario usuario = new Usuario();
		pst = conexion.prepareStatement("DELETE FROM usuarios WHERE codigo = (?)");
		
		pst.setString(1, codigo);
		pst.execute();
		
		
	}
	
	
	public Usuario modificarUsuario(String codigo, Usuario usuario) throws SQLException {
	
	    pst = conexion.prepareStatement("UPDATE usuarios SET nombre_apellido = (?), dni = (?) WHERE codigo = (?);");
	    
	    pst.setString(1, usuario.getNombre_apellido());
	    pst.setString(2, usuario.getDni());
	    pst.setString(3, codigo);
	    
	    pst.executeUpdate();
	   
	    return usuario;
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
}