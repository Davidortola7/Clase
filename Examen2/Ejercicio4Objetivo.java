
public class Ejercicio4Objetivo {

	// Ejercicio 4 Examen 2ª evaluacion, David Ortolá Guerrero

	// Funcion que calcula la suma entre los numeros del array y determina si es
	// igual al objetivo

	public static void numObjetivo(int objetivo, int[] array) {

		int cont = 0;

		for (int i = 0; i < array.length; i++) {

			cont = array[i];

			for (int j = 0; j < array.length; j++) {

				if (cont + array[j] == objetivo) {

					System.out.println("[" + cont + "," + j + "]");
				}

			}
		}

	}

	public static void main(String[] args) {

		System.out.println("Ejemplo 1:");

		int objetivo = 9;
		int[] array = { 2, 7, 11, 15 };

		System.out.println("Objetivo: " + objetivo);

		numObjetivo(objetivo, array);

		System.out.println("Ejemplo 2:");

		int objetivo2 = 6;
		int[] array2 = { 3, 2, 6 };

		System.out.println("Objetivo: " + objetivo2);

		numObjetivo(objetivo2, array2);

		System.out.println("Ejemplo 3:");

		int objetivo3 = 6;
		int[] array3 = { 3, 3 };

		System.out.println("Objetivo: " + objetivo3);

		numObjetivo(objetivo3, array3);

	}

}
