import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int temperatura[] = new int[10];
		int pos = 0;
		int neg = 0;
		int contNeg= 0 ;
		int contPos= 0 ;

		for(int i = 0; i<10;i++) {
			System.out.println("Introduce una temperatura");
			temperatura[i]=sc.nextInt();


			for (int j = 0; j < 10; j++) {
				if (temperatura[j] > 0){

					pos =pos + temperatura[j];
					contPos++;

				} else if (temperatura[j] < 0){

					neg =neg + temperatura[j];
					contNeg++;

				}
			}
		}

		int posFinal = pos/contPos;
		int negFinal = neg/contNeg;

		System.out.println("La media de los numeros positivos es "+posFinal);
		System.out.println("La media de los numeros negativos es "+negFinal);

		sc.close();
	}

}



