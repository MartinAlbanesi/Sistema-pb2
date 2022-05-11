package entities;

public class Usuario {
	private String nombre;
	private Integer edad;
	private Integer dni;
	private String usuario;
	private String contraseña;
	
	public Usuario(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.usuario = null;
		this.contraseña = null;
	}
/*
	public Usuario (String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.esRegistrado = true;
	}
*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + "]";
	}
	
	
}
