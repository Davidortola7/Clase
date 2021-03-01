import java.util.Scanner;

//Ejercicio 2 Examen 2ª evaluacion, David Ortolá Guerrero

public class Ejercicio2ArrayMult3 {
	
	//Función que rellena la array con datos pedidos al usuario

	public static int[] rellenarArray(int n) {
		
		Scanner sc = new Scanner(System.in);

		int[] numeros;
		numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce la posicion [" + i + "] del array");
			numeros[i] = sc.nextInt();

		}
		
		sc.close();
		
		return numeros;

	}
	
	//Funcion que imprime por pantalla los numeros dentro de la array multiplos de 3

	public static void multiplos3(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 3 == 0) {

				System.out.println("v[" + i + "] = " + array[i]);

			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud del array");
		int longitud = sc.nextInt();
		
		multiplos3(rellenarArray(longitud));
		
		

		sc.close();

	}

}
