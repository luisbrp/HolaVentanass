package vista;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controlador.ControladorPrincipal;

public class App {

	public static void main(String[] args) {
		principal principal = new principal();
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ControladorPrincipal controladorPrincipal = new ControladorPrincipal(principal);
		controladorPrincipal.inicializar();
		
		principal.setVisible(true);
	}

}
