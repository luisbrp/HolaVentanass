package modelo;


public class Usuario {
	//atributos relacionados con campos
	
		//atributos relacionados con relaciones
		
		//metodos, getters y setters
	
	private int id;
	private String nombre_apellido;
	private String dni;
	private String codigo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_apellido() {
		return nombre_apellido;
	}
	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre_apellido=" + nombre_apellido + ", dni=" + dni + ", codigo=" + codigo
				+ "]";
	}
}
