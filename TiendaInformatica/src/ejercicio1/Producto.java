package ejercicio1;

/**
 * Clase abstracta que representa un producto genérico dentro del sistema.
 * 
 * <p>Contiene los atributos y comportamientos comunes a todos los tipos de productos,
 * tales como el precio base, la marca y el stock disponible. 
 * Las subclases deben implementar el método calcularPrecioU
 * para determinar el precio final según sus propias reglas.</p>
 * 
 * @author Juanma
 * @version 1.0
 */
public abstract class Producto {

    /** Precio base del producto. */
    protected double precio;

    /** Marca del producto. */
    protected String marca;

    /** Cantidad de unidades disponibles en stock. */
    protected int stock;

    /**
     * Constructor que inicializa un producto con los valores especificados.
     *
     * @param precio precio base del producto
     * @param marca marca del producto
     * @param stock cantidad de unidades disponibles
     */
    public Producto(double precio, String marca, int stock) {
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }

    /**
     * Obtiene el precio base del producto.
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el producto.
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la marca del producto.
     *
     * @return marca del producto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece una nueva marca para el producto.
     *
     * @param marca nueva marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la cantidad actual de unidades en stock.
     *
     * @return cantidad de stock disponible
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica la cantidad de unidades disponibles en stock.
     *
     * @param stock nueva cantidad de stock (debe ser mayor que 0)
     * @return el valor actualizado del stock
     * @throws IllegalArgumentException si el stock es 0 o negativo
     */
    public int setStock(int stock) {
        if (stock <= 0) {
            throw new IllegalArgumentException("El stock no puede ser 0 ni negativo");
        }
        return this.stock = stock;
    }

    /**
     * Calcula el precio unitario final del producto.
     * 
     * <p>Este método debe ser implementado por las subclases
     * para aplicar descuentos, recargos o cualquier otra lógica 
     * particular del tipo de producto.</p>
     *
     * @return precio final del producto
     */
    public abstract double calcularPrecioU();
}
