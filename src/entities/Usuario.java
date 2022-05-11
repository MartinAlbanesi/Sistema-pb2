package entities;

public class Usuario {
	private String nombre;
	private Integer edad;
	private Integer dni;
	private String usuario;
	private String contrase�a;
	
	public Usuario(String nombre, Integer edad, Integer dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.usuario = null;
		this.contrase�a = null;
	}
/*
	public Usuario (String usuario, String contrase�a) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", usuario=" + usuario
				+ ", contrase�a=" + contrase�a + "]";
	}
	
	
}
