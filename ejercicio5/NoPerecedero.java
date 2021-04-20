package ejercicio5;

/**
 * @author David Ortolá
 * 
 *         <h1>T8. Ejercicio 5 - NoPerecedero</h1>
 * 
 * @since 19/04/2021
 *
 */

public class NoPerecedero extends Producto {

	private String tipo;

	/**
	 * 
	 * <h2>Constructor por defecto</h2>
	 * 
	 * Este constructor es el de por defecto
	 * 
	 * 
	 */

	public NoPerecedero() {
		super();

	}

	/**
	 * 
	 * <h2>Constructor parametrizado</h2>
	 * 
	 * Este constructor es el que esta parametrizado y hereda de la calase madre
	 * 
	 * @param nombre es el nombre del producto, heredado de la clase Producto.
	 * @param precio es el precio del producto, heredado de la clase Producto.
	 * @param tipo   es el tipo del producto
	 */

	public NoPerecedero(String nombre, int precio, String tipo) {

		super(nombre, precio);

		this.tipo = tipo;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * <h2>Método calcular</h2>
	 * 
	 * Este método es el calcular pero en la clase NoPerecedero es igual que en la
	 * clase producto, por eso se coge el mismo resultado que en esa clase y no se
	 * modifica.
	 * 
	 * @return Este devuelve la cantidad que se calcula en el clase produto.
	 * 
	 */

	public int calcular(int cantidad) {

		return super.calcular(cantidad);

	}

}
