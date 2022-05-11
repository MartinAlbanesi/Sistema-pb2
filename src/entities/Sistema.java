package entities;
import java.util.*;

public class Sistema {

	private String nombreDelSistema;
	private int cantidadMaximaDeUsuarios;
	private int cantidadDeUsuariosLogueados;
	private int cantidadDeUsuariosBloqueados;
	private Double edadPromedio;
	private List<Usuario> usuarios;
	private List<Usuario> usuariosBloqueados;
	
	

	//Constructor
	public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
		this.cantidadDeUsuariosBloqueados = 0;
		this.cantidadDeUsuariosBloqueados = 0;
		this.usuarios = new ArrayList<Usuario>();
		this.usuariosBloqueados = new ArrayList<Usuario>();
	}

	public boolean ingresarUsuario (Usuario nuevoUsuario) {
		for(Usuario usuario : usuarios) {
			if(cantidadDeUsuariosLogueados >= cantidadMaximaDeUsuarios || usuario.getDni().equals(nuevoUsuario.getDni())) {
				cantidadDeUsuariosBloqueados++;
				usuariosBloqueados.add(nuevoUsuario);
				return false;
			}
		}
		cantidadDeUsuariosLogueados++;
		usuarios.add(nuevoUsuario);
		return true;
	}
	
	public Integer calcularLaCantidadDeUsuariosLogueados() {
		int totalUsuariosLogueados=0;
		for(Usuario usuario : usuarios) {
			totalUsuariosLogueados++;
		}
		return totalUsuariosLogueados;
	}
	
	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		int totalUsuariosBloqueados=0;
		for(Usuario usuario : usuariosBloqueados) {
			totalUsuariosBloqueados++;
		}
		return totalUsuariosBloqueados;
	}

	/*
	public Integer calcularElPorcentajeDeUsuariosLogueados() {
		return (usuarios.size() + usuariosBloqueados.size()) / 
	}
	*/
	
	public Double calcularEdadPromedio() {
		int edades = 0;
		for(Usuario usuario : usuarios) {
			edades += usuario.getEdad();
		}
		return edadPromedio = (double) (edades / usuarios.size());
	}
	
	public Boolean registrarUsuario(String usuario, String contraseña) {
		if (usuario != null || contraseña != null) {
			for(Usuario usuarioActual : usuarios) {
				if(usuarioActual.getNombre() == usuario) {
					usuarioActual.setUsuario(usuario);
					usuarioActual.setContraseña(contraseña);
					return true;
				}
			}
		}
		return false;
	}
	
	public Boolean loguearUsuario(String usuario, String contraseña) {
		Boolean seLogueoCorrectamente = false;
		for(Usuario usuarioActual : usuarios) {
			if(usuarioActual.getUsuario() == usuario && usuarioActual.getContraseña() == contraseña) {
				seLogueoCorrectamente = true;
			}
		}
		return seLogueoCorrectamente;
	}
	
	public void imprimirEstadisticas() {
		System.out.println("Cantidad de usuarios logueados: " + cantidadDeUsuariosLogueados);
		System.out.println("Cantidad de usuarios bloqueados: " + cantidadDeUsuariosBloqueados);
		System.out.println("Edad promedio de usuarios: " + edadPromedio);
	}
	
	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public int getCantidadMaximaDeUsuarios() {
		return cantidadMaximaDeUsuarios;
	}

	public int getCantidadDeUsuariosLogueados() {
		return cantidadDeUsuariosLogueados;
	}

	public int getCantidadDeUsuariosBloqueados() {
		return cantidadDeUsuariosBloqueados;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public List<Usuario> getUsuariosBloqueados() {
		return usuariosBloqueados;
	}
	
	public void imprimirListaUsuarios() {
		for(Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}
	}
	
	
}

