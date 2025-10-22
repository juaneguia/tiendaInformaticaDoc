package ejercicio1;

/**
 * Clase que representa a un cajero dentro del sistema de ventas.
 * 
 * <p>Permite calcular el precio final de una transacción en función del producto
 * y la cantidad comprada. También valida que los valores utilizados sean correctos
 * (por ejemplo, que la cantidad no sea cero o negativa).</p>
 * 
 * <p>Esta clase actúa como intermediaria entre los productos y el cálculo
 * del total a pagar por el cliente.</p>
 * 
 * @author Juanma
 * @version 1.0
 */
public class Cajero {

    /** Nombre del cajero encargado de la venta. */
    private String nombreCajero;

    /** Producto que el cajero está registrando en la venta. */
    private Producto producto;

    /** Cantidad de unidades del producto vendidas. */
    private int cantidad;

    /**
     * Constructor que inicializa un nuevo cajero con los datos especificados.
     *
     * @param nombreCajero nombre del cajero
     * @param producto producto asociado a la venta
     * @param cantidad cantidad de unidades vendidas
     */
    public Cajero(String nombreCajero, Producto producto, int cantidad) {
        super();
        this.nombreCajero = nombreCajero;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el nombre del cajero.
     *
     * @return nombre del cajero
     */
    public String getNombreCajero() {
        return nombreCajero;
    }

    /**
     * Establece el nombre del cajero.
     *
     * @param nombreCajero nuevo nombre del cajero
     */
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    /**
     * Obtiene el producto asociado a la operación.
     *
     * @return producto del cajero
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto que el cajero registra.
     *
     * @param producto nuevo producto asociado
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad de unidades del producto.
     *
     * @return cantidad de unidades
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Modifica la cantidad de unidades vendidas.
     *
     * @param cantidad nueva cantidad (debe ser mayor que 0)
     * @return valor actualizado de la cantidad
     * @throws IllegalArgumentException si la cantidad es 0 o negativa
     */
    public int setCantidad(int cantidad) {
        if (cantidad == 0) {
            throw new IllegalArgumentException("La cantidad no puede ser 0 ni negativa");
        }
        return this.cantidad = cantidad;
    }

    /**
     * Calcula el precio final de la venta.
     * 
     * <p>El precio final se obtiene multiplicando el precio unitario del producto
     * (calculado mediante Producto#calcularPrecioU()) por la cantidad vendida.</p>
     * 
     * <p>Si el precio unitario o la cantidad son 0, se lanza una excepción.</p>
     *
     * @return precio total de la venta
     * @throws IllegalArgumentException si el precio unitario o la cantidad son 0
     */
    public double calcularPrecioFinal() {
        if (producto.calcularPrecioU() == 0 || cantidad == 0) {
            throw new IllegalArgumentException("El valor no puede ser 0");
        }
        double precioFinal = producto.calcularPrecioU() * cantidad;
        return precioFinal;
    }
}
