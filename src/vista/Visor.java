package vista;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Usuario;

/**
 * 
 * @author irakasle
 * en esta clase estarán los métodos que visulicen informacíon
 * visualizarInscripciones
 * visualizarMensaje
 * etc 
 *
 */

public class Visor {
	public static void mostrarUsuario(Usuario usuario) {
		System.out.println(usuario);
	}
	public static void mostrarUsuariosActividad (ArrayList<Usuario> usuarios ) {
		for (Usuario usuario : usuarios) {
			mostrarUsuario(usuario);
		}
	}
}
