import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero[] = new int[10];
		int par = 0;
		int impar = 0;
		int contPar = 0;
		int contImpar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero");
			numero[i] = sc.nextInt();

			if (numero[i] % 2 == 0) {

				par = par + numero[i];
				contPar++;

			} else {

				impar = impar + numero[i];
				contImpar++;

			}

		}

		int medPar = par / contPar;
		int medImpar = impar / contImpar;

		System.out.println("La media de los pares es " + medPar);
		System.out.println("La media de los impares es " + medImpar);

		sc.close();

	}

}
