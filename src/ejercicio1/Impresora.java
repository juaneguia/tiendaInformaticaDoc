package ejercicio1;

/**
 * Clase que representa una impresora dentro del sistema de productos.
 * 
 * <p>Extiende la clase abstracta Producto e incorpora atributos
 * específicos como la velocidad de impresión y la capacidad de imprimir
 * a color. Implementa el método #calcularPrecioU() para determinar
 * el precio final del producto en función de si imprime en color o no.</p>
 * 
 * @author Juanma
 * @version 1.0
 */
public class Impresora extends Producto {

    /** Velocidad de impresión medida en páginas por minuto (PPM). */
    private int velocidad;

    /** Indica si la impresora puede imprimir a color. */
    private boolean color;

    /**
     * Constructor que inicializa una nueva impresora con los valores especificados.
     *
     * @param precio precio base del producto
     * @param marca marca del producto
     * @param stock cantidad de unidades disponibles
     * @param velocidad velocidad de impresión en páginas por minuto
     * @param color indica si la impresora imprime a color ({@code true}) o solo en blanco y negro ({@code false})
     */
    public Impresora(double precio, String marca, int stock, int velocidad, boolean color) {
        super(precio, marca, stock);
        this.velocidad = velocidad;
        this.color = color;
    }

    /**
     * Obtiene la velocidad de impresión de la impresora.
     *
     * @return velocidad en páginas por minuto
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Establece la velocidad de impresión de la impresora.
     *
     * @param velocidad nueva velocidad en páginas por minuto
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Indica si la impresora imprime a color.
     *
     * @return {@code true} si imprime a color, {@code false} si solo imprime en blanco y negro
     */
    public boolean isColor() {
        return color;
    }

    /**
     * Modifica la capacidad de impresión a color de la impresora.
     *
     * @param color {@code true} si imprime a color, {@code false} si no
     */
    public void setColor(boolean color) {
        this.color = color;
    }

    /**
     * Calcula el precio final de la impresora.
     * 
     * <p>Si la impresora es a color, se aplica un incremento del 20%
     * sobre el precio base. En caso contrario, se mantiene el precio original.</p>
     *
     * @return precio final de la impresora
     */
    @Override
    public double calcularPrecioU() {
        if (color) {
            precio = getPrecio() * 1.20;
        } else {
            precio = getPrecio();
        }
        return precio;
    }
}
