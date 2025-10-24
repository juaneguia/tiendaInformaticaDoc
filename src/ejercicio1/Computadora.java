package ejercicio1;

/**
 * Clase que representa una computadora dentro del sistema de productos.
 * 
 * <p>Extiende la clase abstracta Producto e incorpora atributos
 * específicos como el modelo, la memoria RAM, el almacenamiento y la 
 * presencia de iluminación RGB. Implementa el método calcularPrecioU()
 * para determinar el precio final del producto considerando si tiene RGB.</p>
 * 
 * @author Juanma
 * @version 1.0
 */
public class Computadora extends Producto {

    /** Modelo de la computadora. */
    private String modelo;

    /** Cantidad de memoria RAM (en GB). */
    private int ram;

    /** Capacidad de almacenamiento (en GB). */
    private int almacenamiento;

    /** Indica si la computadora posee iluminación RGB. */
    private boolean rgb;

    /**
     * Constructor que inicializa una nueva computadora con los valores especificados.
     *
     * @param precio precio base del producto
     * @param marca marca del producto
     * @param stock cantidad de unidades disponibles
     * @param modelo modelo de la computadora
     * @param ram cantidad de memoria RAM en GB
     * @param almacenamiento capacidad de almacenamiento en GB
     * @param rgb indica si la computadora tiene iluminación RGB
     */
    public Computadora(double precio, String marca, int stock, String modelo, int ram, int almacenamiento,
            boolean rgb) {
        super(precio, marca, stock);
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.rgb = rgb;
    }

    /**
     * Obtiene el modelo de la computadora.
     *
     * @return modelo de la computadora
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece un nuevo modelo para la computadora.
     *
     * @param modelo nuevo modelo de la computadora
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la cantidad de memoria RAM de la computadora.
     *
     * @return cantidad de RAM en GB
     */
    public int getRam() {
        return ram;
    }

    /**
     * Establece la cantidad de memoria RAM.
     *
     * @param ram nueva cantidad de RAM (en GB)
     * @return el valor actualizado de la RAM
     */
    public int setRam(int ram) {
        return this.ram = ram;
    }

    /**
     * Obtiene la capacidad de almacenamiento de la computadora.
     *
     * @return almacenamiento en GB
     */
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * Establece la capacidad de almacenamiento.
     *
     * @param almacenamiento nueva capacidad de almacenamiento (en GB)
     * @return el valor actualizado del almacenamiento
     */
    public int setAlmacenamiento(int almacenamiento) {
        return this.almacenamiento = almacenamiento;
    }

    /**
     * Indica si la computadora tiene iluminación RGB.
     *
     * @return {@code true} si tiene RGB, {@code false} en caso contrario
     */
    public boolean isRgb() {
        return rgb;
    }

    /**
     * Modifica la propiedad RGB de la computadora.
     *
     * @param rgb {@code true} si la computadora tiene RGB, {@code false} si no
     */
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    /**
     * Calcula el precio final de la computadora.
     * 
     * <p>Si la computadora posee iluminación RGB, se aplica un incremento del 10%
     * sobre el precio base. En caso contrario, se mantiene el precio original.</p>
     *
     * @return precio final de la computadora
     */
    @Override
    public double calcularPrecioU() {
        if (rgb) {
            precio = getPrecio() + (getPrecio() * 0.1);
        } else {
            precio = getPrecio();
        }
        return precio;
    }
}
