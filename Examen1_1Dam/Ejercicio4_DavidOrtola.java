import java.util.Scanner;

public class Ejercicio4_DavidOrtola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que dibuja un rectangulo");
		
		System.out.println("Introduzca la base");
		int b = sc.nextInt();
		System.out.println("Introduzca la altura");
		int h = sc.nextInt();

		for(int i=0;h>i;i++) {
			for(int j=1;b>j;j++) {
			System.out.print("*");
			}
			System.out.println("*");
		}
			
			
			sc.close();	

	}

}
