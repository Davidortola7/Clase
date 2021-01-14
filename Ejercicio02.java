 import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sumNotas = 0;
		int contNotas = 0;
		
		System.out.println("Cuantas notas vas a introducir");
		int nNotas = sc.nextInt();
		
		double notas[] = new double[nNotas];
		
		for (int i=0;i<nNotas;i++) {
			System.out.println("Introduce una nota");
			notas[i]=sc.nextDouble();
			
			sumNotas = sumNotas + notas[i];
			
			contNotas++;
			
			
		}
		
		
		double media=sumNotas/contNotas;
		
		System.out.println("La media de las notas es "+media);
		
		for (int i=0;i<nNotas;i++) {
			if (notas[i]>media) {
				System.out.println(notas[i]);
			}
		}
		
		sc.close();

	}

}
