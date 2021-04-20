package ejercicio5;

/**
 * @author David Ortolá
 * 
 *         <h1>T8. Ejercicio 5 - Principal</h1>
 * 
 * @since 19/04/2021
 *
 */

public class Principal {

	public static void main(String[] args) {

		int pFPerecedero = 0;
		int pFNoPerecedero = 0;

		/**
		 * 
		 * Se crea un array con diferentes productos de diferentes tipos
		 * 
		 */

		Producto aProductos[] = new Producto[10];

		aProductos[0] = new Perecedero("Si", 1, "Donuts", 10);
		aProductos[1] = new Perecedero("No", 2, "Rosquilletas", 15);
		aProductos[2] = new Perecedero("Ns", 3, "Pizza", 20);
		aProductos[3] = new Perecedero("Ya", 5, "Pollo", 10);
		aProductos[4] = new Perecedero("BB", 3, "Alcachofa", 4);
		aProductos[5] = new NoPerecedero("Macaco", 10, "B");
		aProductos[6] = new NoPerecedero("Palomitas", 10, "A");
		aProductos[7] = new NoPerecedero("Hierva", 10, "C");
		aProductos[8] = new NoPerecedero("Pelota", 10, "E");
		aProductos[9] = new NoPerecedero("Cafetera", 10, "D");

		/**
		 * 
		 * En este for se recorre el array y con el instanceof se busca diferenciar de
		 * que tipo es cada producto para calcularlo por separado
		 * 
		 */

		for (int i = 0; i < aProductos.length; i++) {

			if (aProductos[i] instanceof Perecedero) {

				pFPerecedero = aProductos[i].calcular(5) + pFPerecedero;

			} else {

				pFNoPerecedero = aProductos[i].calcular(5) + pFNoPerecedero;

			}

		}

		System.out.println("La suma final de todos los productos perecederos es: ");
		System.out.println(pFPerecedero);

		System.out.println("......................................................");

		System.out.println("La suma final de todos los productos no perecederos es: ");
		System.out.println(pFNoPerecedero);

	}
}
