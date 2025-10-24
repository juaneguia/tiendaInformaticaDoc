package ejercicio1;



public class main {

	public static void main(String[] args) {
		
		 Producto p1 = new Impresora(10000, "Epson", 200, 10, false);
		 Producto p2 = new Impresora(10000, "Epson", 200, 10, true);
		 Producto p3 = new Computadora(500000, "ASUS", 50, "Escritorio", 8, 512, false);
		 Producto p4 = new Computadora(800000, "ASUS", 50, "Escritorio", 16, 512, true);
		 
		 Cajero c1 = new Cajero("Maria", p1, 10);
		 Cajero c2 = new Cajero("Juan", p2, 5);
		 Cajero c3 = new Cajero("Hernan", p3, 3);
		 Cajero c4 = new Cajero("Betina", p4, 1);
		 
		 System.out.println("El precio de la venta es: " + c1.calcularPrecioFinal());
		 System.out.println("El precio de la venta es: " + c2.calcularPrecioFinal());
		 System.out.println("El precio de la venta es: " + c3.calcularPrecioFinal());
		 System.out.println("El precio de la venta es: " + c4.calcularPrecioFinal());

	}

}
