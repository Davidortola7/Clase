import java.util.Scanner;

public class Ejercicio3_DavidOrtola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int n = sc.nextInt();
		
		int cont = 0;
		
		
		while(cont<=10) {
			System.out.println(n+" x "+cont+" = "+(n*cont));
			cont = cont+1;
			
		}
		
		sc.close();
	}

}
