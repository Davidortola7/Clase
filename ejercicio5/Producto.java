package ejercicio5;

/**
 * @author David Ortol�
 * 
 *         <h1>T8. Ejercicio 5 - Producto</h1>
 * 
 * @since 19/04/2021
 *
 */
public class Producto {

	private String nombre;
	private int precio;

	/**
	 * 
	 * <h2>Constructor por defecto</h2>
	 * 
	 * Este es el constructor con todos sus datos por defecto
	 * 
	 */

	public Producto() {

	}

	/**
	 * 
	 * <h2>Constructor parametrizado</h2>
	 * 
	 * Con este constructor se puede insertar por par�metro los datos
	 * 
	 * @param nombre el nombre del producto
	 * @param precio lo que cuesta el producto
	 * 
	 */

	public Producto(String nombre, int precio) {

		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// M�todos

	/**
	 * 
	 * <h2>M�todo calcular</h2>
	 * 
	 * Este metodo clacula el precio de los productos
	 * 
	 * @param cantidad el n�mero de productos que hay
	 * @return El resultado de la multiplicaci�n del n�mero de productos por su
	 *         precio
	 * 
	 * @see clacular de la clase Precedero
	 * 
	 */

	public int calcular(int cantidad) {

		return cantidad * precio;

	}

	/**
	 * 
	 * <h2>M�todo toString</h2>
	 * 
	 * Este metodo coge los datos y los introduce en un String
	 * 
	 */

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
