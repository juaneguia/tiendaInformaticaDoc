package ejercicio1.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio1.Computadora;
import ejercicio1.Impresora;

class ImpresoraTest {

	@Test
	public void calcularPrecioTest() {
		Impresora i1 = new Impresora(1000, "hp", 20, 10, true);
		
		double resultado = i1.calcularPrecioU();
		assertEquals(1000, resultado); 
	}

	@Test
	public void color() {
		Impresora i2 = new Impresora(1000, "hp", 20, 10, true);
		assertTrue(i2.isColor());
	}
	
	@Test
	public void setStockTest() {
		Impresora i2 = new Impresora(1000, "hp", 0, 10, true);

	    assertThrows(IllegalArgumentException.class, () -> {
	        i2.setStock(0);
	    });}
}
