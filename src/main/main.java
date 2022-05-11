package main;

import java.util.Scanner;
import entities.Sistema;
import entities.Usuario;

public class main {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Integer opcion;
	String nombreUsuario;
	String contraseña;
	Sistema unlam = new Sistema("Unlam",3);
	Usuario usuario1 = new Usuario("Martin",50,41914511);
	Usuario usuario2 = new Usuario("Monica",50,38521675);
	Usuario usuario3 = new Usuario("Adrian",53,38123572);
	Usuario usuario4 = new Usuario("Brenda",27,39522873);
	
	do {
		imprimirMenu();
		opcion = teclado.nextInt();
	}while(opcion < 1 || opcion > 3);
	
	switch(opcion) {
	case 1:
		System.out.println("Ingresar el nombre de usuario: ");
		nombreUsuario = teclado.nextLine();
		System.out.println("Ingresar la contraseña: ");
		contraseña = teclado.nextLine();
		unlam.registrarUsuario(nombreUsuario, contraseña);
		break;
		
	case 2:
		unlam.imprimirEstadisticas();
		break;
		
	case 3:
		Boolean exito = false;
		do {
			System.out.println("Ingresar el nombre de usuario: ");
			nombreUsuario = teclado.nextLine();
			System.out.println("Ingresar la contraseña: ");
			contraseña = teclado.nextLine();
			exito = unlam.loguearUsuario(nombreUsuario, contraseña);
			if(exito == false) {
				System.out.println("El usuario no pudo loguearse correctamente");
			}
		}while(exito == false);
		break;
		
	}
	
	/*
	System.out.println(unlam.getUsuarios());
	System.out.println(unlam.getUsuariosBloqueados());
	
	unlam.ingresarUsuario(usuario1);
	unlam.ingresarUsuario(usuario2);
	unlam.ingresarUsuario(usuario3);
	unlam.ingresarUsuario(usuario4);
	unlam.ingresarUsuario(usuario1);
	
	System.out.println(unlam.getUsuarios().size());
	System.out.println(unlam.getUsuariosBloqueados().size());
	
	System.out.println("Usuarios logueados: " + unlam.calcularLaCantidadDeUsuariosLogueados());
	System.out.println("Usuarios bloqueados: " + unlam.calcularLaCantidadDeUsuariosBloqueados());
	
	System.out.println("Edad promedio: " + unlam.calcularEdadPromedio());
	
	unlam.registrarUsuario("Martin", "1234");
	unlam.registrarUsuario("Martin", "1234");
	unlam.imprimirListaUsuarios();
	
	System.out.println(unlam.loguearUsuario("Martin", "1234"));
	*/
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Registrar nuevo usuario");
		System.out.println("2. Ver estadisticas del sistema");
		System.out.println("3. Loguear usuario");
	}
	

}
	
