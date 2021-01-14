
public class Ejercicio03 {

	public static void primeros(int numeros[]) {

		int primeros[];
		primeros = new int[20];

		int x = 0;

		for (int i = 0; i < 20; i++) {
			primeros[i] = x + 1;
			x++;
			System.out.print(primeros[i] + ", ");
		}

	}

	public static void main(String[] args) {

		int numeros[];
		numeros = new int[20];

		primeros(numeros);

	}

}
