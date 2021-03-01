import java.util.Scanner;

//Ejercicio 3 Examen 2ª evaluación David Ortolá Guerrero

public class Ejercicio3Matriz {
	
	//Función que rellena la matriz con numeros aleatorios

	public static int[][] matriz(int n) {

		int[][] matriz;
		matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = (int) (Math.random() * 10);
			}
		}

		return matriz;
	}

	//Función que calcula la media de las diagonales y muestra por pantalla el total
	
	public static void mediasDiagonales(int[][] matriz) {

		int cont1 = 0;
		int cont2 = 0;

		double sumDiagonal1 = 0;

		double sumDiagonal2 = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {

					sumDiagonal1 += matriz[i][j];
					
					cont1++;

				}

				if ((i + j) == (matriz.length - 1)) {

					sumDiagonal2 += matriz[i][j];
					
					cont2++;
				}
			}

		}
		
		double sumaTotal = sumDiagonal1+sumDiagonal2;
		double contTotal = cont1+cont2;
		
		double mediaDiagonales = sumaTotal/contTotal;
		
		System.out.println("La media de las diagonales es "+mediaDiagonales);

	}

	public static void main(String[] args) {
		
		System.out.println("Introduce las dimensiones de la matriz");

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();

		int[][] matriz = matriz(l);

		mediasDiagonales(matriz);
		

		sc.close();
	}

}
