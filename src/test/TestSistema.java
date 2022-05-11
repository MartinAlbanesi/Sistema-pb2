package test;

import static org.junit.Assert.*;

import org.junit.*;

import entities.*;

public class TestSistema {
	
	
	@Test
	public void queSePuedaCrearUnSistema() {
		//Preparaci�n
		Sistema sistemaNuevo;
		final String NOMBRE_DEL_SISTEMA_ESPERADO = "Unlam";
		final int CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA = 5;
		//Ejecuci�n
		sistemaNuevo = new Sistema(NOMBRE_DEL_SISTEMA_ESPERADO,CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA);
		//Validaci�n
		assertNotNull(sistemaNuevo);
		assertEquals(NOMBRE_DEL_SISTEMA_ESPERADO,sistemaNuevo.getNombreDelSistema());
		assertEquals(CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA,sistemaNuevo.getCantidadMaximaDeUsuarios());
	}
	
	@Test
	public void queSePuedaCrearUnUsuario() {
		//Preparaci�n
		Usuario usuarioNuevo;
		final String NOMBRE_ESPERADO = "Martin";
		final Integer EDAD_ESPERADA = 23;
		final Integer DNI_ESPERADO = 41914511;
		//Ejecuci�n
		usuarioNuevo = new Usuario(NOMBRE_ESPERADO,EDAD_ESPERADA,DNI_ESPERADO);
		//Validaci�n
		assertNotNull(usuarioNuevo);
		assertEquals(NOMBRE_ESPERADO,usuarioNuevo.getNombre());
		assertEquals(EDAD_ESPERADA,usuarioNuevo.getEdad());
		assertEquals(DNI_ESPERADO,usuarioNuevo.getDni());
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioAlSistema() {
		//Preparaci�n
		Sistema sistemaNuevo;
		Usuario usuarioNuevo;
		final String NOMBRE_ESPERADO = "Martin";
		final Integer EDAD_ESPERADA = 23;
		final Integer DNI_ESPERADO = 41914511;
		final String NOMBRE_DEL_SISTEMA_ESPERADO = "Unlam";
		final int CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA = 5;
		//Ejecuci�n
		sistemaNuevo = new Sistema(NOMBRE_DEL_SISTEMA_ESPERADO,CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA);
		usuarioNuevo = new Usuario(NOMBRE_ESPERADO,EDAD_ESPERADA,DNI_ESPERADO);
		sistemaNuevo.ingresarUsuario(usuarioNuevo);
		//Validaci�n
		assertNotNull(sistemaNuevo.getUsuarios());
		assertTrue(sistemaNuevo.getUsuarios().contains(usuarioNuevo));
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeLosUsuariosDeUnSistema() {
		//Preparaci�n
		Sistema sistemaNuevo;
		Usuario usuarioNuevo1;
		Usuario usuarioNuevo2;
		Usuario usuarioNuevo3;
		
		final String NOMBRE_ESPERADO1 = "Martin";
		final Integer EDAD_ESPERADA1 = 50;
		final Integer DNI_ESPERADO1 = 41914511;
		
		final String NOMBRE_ESPERADO2 = "Monica";
		final Integer EDAD_ESPERADA2 = 50;
		final Integer DNI_ESPERADO2 = 39312512;
		
		final String NOMBRE_ESPERADO3 = "Adrian";
		final Integer EDAD_ESPERADA3 = 53;
		final Integer DNI_ESPERADO3 = 39472642;
		
		final String NOMBRE_DEL_SISTEMA_ESPERADO = "Unlam";
		final int CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA = 5;
		final Double EDAD_PROMEDIO_ESPERADA = 51.0;
		//Ejecuci�n
		sistemaNuevo = new Sistema(NOMBRE_DEL_SISTEMA_ESPERADO,CANTIDAD_MAXIMA_DE_USUARIOS_ESPERADA);
		usuarioNuevo1 = new Usuario(NOMBRE_ESPERADO1,EDAD_ESPERADA1,DNI_ESPERADO1);
		usuarioNuevo2 = new Usuario(NOMBRE_ESPERADO2,EDAD_ESPERADA2,DNI_ESPERADO2);
		usuarioNuevo3 = new Usuario(NOMBRE_ESPERADO3,EDAD_ESPERADA3,DNI_ESPERADO3);
		sistemaNuevo.ingresarUsuario(usuarioNuevo1);
		sistemaNuevo.ingresarUsuario(usuarioNuevo2);
		sistemaNuevo.ingresarUsuario(usuarioNuevo3);
		sistemaNuevo.calcularEdadPromedio();
		//Validaci�n
		assertTrue(sistemaNuevo.getUsuarios().contains(usuarioNuevo1));
		assertTrue(sistemaNuevo.getUsuarios().contains(usuarioNuevo2));
		assertTrue(sistemaNuevo.getUsuarios().contains(usuarioNuevo3));
		assertEquals(EDAD_PROMEDIO_ESPERADA,sistemaNuevo.calcularEdadPromedio(),0.01);
	}
	
	@Test
	public void queSePuedaLoguearUnUsuarioConUsuarioYContrase�a() {
		
	}
	
}
