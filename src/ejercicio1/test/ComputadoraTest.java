package ejercicio1.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ejercicio1.Computadora;

class ComputadoraTest {
	 
	static Computadora c1;
	@BeforeAll 
	static void inicializar() {
	 c1 = new Computadora(1000, "hp", 10, "dsmsmd", 16, 512, false);
	} 
	@BeforeEach 
	void mensaje() {
		System.out.println("Aca se esta ejecutando el BeforeEach");
	}
	
	@Test
	public void calcularPrecioUTest() {
		
		double resultado = c1.calcularPrecioU();
		assertNotEquals(19519, resultado); 
	} 
	
	@Test
	@Disabled ("Test no realizado")
	public void setRamTest() {
		
		int nuevaRam = c1.setRam(32);
		assertEquals(32, nuevaRam); 
	}
	
	@Test
	public void setAlmTest() {

	    assertThrows(NullPointerException.class, () -> {
	        c1.setAlmacenamiento((Integer) null);
	    });
	}
}