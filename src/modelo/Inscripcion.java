package modelo;

public class Inscripcion {
	
	//atributos relacionados con campos
	
		//atributos relacionados con relaciones
		
		//metodos, getters y setters
	
	private int id;
	private int id_usuario;
	private int id_actividad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getId_actividad() {
		return id_actividad;
	}
	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}
	
	
	@Override
	public String toString() {
		return "Inscripcion [id=" + id + ", id_usuario=" + id_usuario + ", id_actividad=" + id_actividad + "]";
	}
	

	
}
