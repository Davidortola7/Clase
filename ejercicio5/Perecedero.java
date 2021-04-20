package ejercicio5;

/**
 * @author David Ortolá
 * 
 *         <h1>T8. Ejercicio 5 - Perecedero</h1>
 * 
 * @since 19/04/2021
 *
 */
public class Perecedero extends Producto {

	private int diasACaducar;
	private String AverageMark;

	/**
	 * 
	 * <h2>Constructor por defecto</h2>
	 * 
	 * Este es el constructor con todos sus datos por defecto y hereda los de su
	 * clase madre.
	 * 
	 */

	public Perecedero() {
		super();

	}

	/**
	 * 
	 * <h2>Constructor parametrizado</h2>
	 * 
	 * Este constructor permite editar los datos por parámetro y hereda los de la
	 * clase madre.
	 * 
	 * @param avgMark      es la marca media.
	 * @param diasACaducar es el numero de dias que le queda al producto para
	 *                     caducar.
	 * @param nombre       es el nombre del producto, heredado de la clase Producto.
	 * @param precio       es el precio del producto, heredado de la clase Producto.
	 * 
	 */

	public Perecedero(String avgMark, int diasACaduca, String nombre, int precio) {

		super(nombre, precio);

		this.diasACaducar = diasACaduca;
		this.AverageMark = avgMark;

	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	public String getAverageMark() {
		return AverageMark;
	}

	public void setAverageMark(String averageMark) {
		AverageMark = averageMark;
	}

	/**
	 * 
	 * <h2>Método calcular</h2>
	 * 
	 * Este método calcula el precio del producto, en este caso se tiene en cuenta
	 * el tiempo que le queda para que se caduque el producto.
	 * 
	 * En el caso de que le falte 1 dia cuesta la cuarta parte. En el caso de que le
	 * falten 2 dias cuesta la tercera parte. Por último en el caso de que falten 3
	 * dias costará la mitad.
	 * 
	 * @return El resultado del calcular de la clase producto y se divide entre un
	 *         número o no dependiendo los dias que le falten para caducar.
	 * 
	 */

	public int calcular(int cantidad) {

		int precioF = super.calcular(cantidad);

		if (diasACaducar == 1) {

			precioF = precioF / 4;

		} else if (diasACaducar == 2) {

			precioF = precioF / 3;

		} else if (diasACaducar == 3) {

			precioF = precioF / 2;

		}

		return precioF;

	}

}
