package ejercicio1.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ejercicio1.Cajero;
import ejercicio1.Impresora;
import ejercicio1.Producto;

class CajeroTest {

	@Test
	public void calcularPrecioTotalTest() {
		Producto p1 = new Impresora(10000, "Epson", 200, 10, false);
		Cajero c1 = new Cajero("Maria", p1, 10);
		double resultado = c1.calcularPrecioFinal();
		assertEquals(100000, resultado); 
	}
	
	@Test
	public void setCantidadTest() {
		Producto p1 = new Impresora(10000, "Epson", 200, 10, false);
		Cajero c1 = new Cajero("Maria", p1, 10);
	    assertThrows(IllegalArgumentException.class, () -> {
	    c1.setCantidad(0);
	    });}
	
	@Test
	public void calcularPrecioTotalcon0Test() {
		Producto p1 = new Impresora(10000, "Epson", 200, 10, false);
		Cajero c1 = new Cajero("Maria", p1, 1);
		assertThrows(IllegalArgumentException.class, () -> {
	        c1.calcularPrecioFinal();
	    });
	}
}
