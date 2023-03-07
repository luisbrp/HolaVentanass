package vista;

import controlador.ControladorPrincipal;

public class App {

	public static void main(String[] args) {
		principal principal = new principal();
		
		ControladorPrincipal cp = new ControladorPrincipal(principal);
		cp.inicializar();
		
		principal.setVisible(true);
	}

}
