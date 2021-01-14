import java.util.Scanner;

public class Ejercicio04 {

	public static void numeros(int[] numeros) {

		Scanner sc = new Scanner(System.in);

		int vector[];
		vector = new int[10];

		int ceros = 0;
		int negativos = 0;
		int positivos = 0;

		for (int i = 0; i < 10; i++) {
			vector[i] = sc.nextInt();

			if (vector[i] == 0) {
				ceros++;
			} else {
				if (vector[i] < 0) {
					negativos++;
				} else {
					positivos++;
				}
			}

		}
		System.out.println("El numero de 0 es " + ceros);
		System.out.println("El numero de numeros negativos es " + negativos);
		System.out.println("El numero de numeros positivos es " + positivos);

		sc.close();
	}

	public static void main(String[] args) {

		int numeros[];
		numeros = new int[10];

		numeros(numeros);

	}

}
