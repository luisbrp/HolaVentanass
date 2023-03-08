package vista;

import controlador.ControladorPrincipal;

public class App {

	public static void main(String[] args) {
		principal principal = new principal();
		
		ControladorPrincipal controladorPrincipal = new ControladorPrincipal(principal);
		controladorPrincipal.inicializar();
		
		principal.setVisible(true);
	}

}
