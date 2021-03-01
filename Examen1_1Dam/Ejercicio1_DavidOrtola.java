import java.util.Scanner;

public class Ejercicio1_DavidOrtola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=1;
		
		while(n<=5) {
			
			System.out.println("Programa que muestra la talla española equivalente.");
			System.out.println("1) S");
			System.out.println("2) M");
			System.out.println("3) L");
			System.out.println("4) XL");
			System.out.println("5) Salir");
			System.out.println("Introduce la talla europea de la camiseta:");
			n=sc.nextInt();
			
			if(n<=0) {
				System.out.println("Introduce un numero entre el 1 y el 5 porfavor.");
			}else {
				if(n==1) {
					System.out.println("La talla española equivalente es 38");
				}
				if(n==2) {
					System.out.println("La talla española equivalente es 40");
				}
				if(n==3) {
					System.out.println("La talla española equivalente es 42");
				}
				if(n==4) {
					System.out.println("La talla española equivalente es 44");
				}
				if(n==5) {
					break;
				}
				
			}
		
		
			
			
		}
		
		System.out.println("Gracias por usar el programa! Que tengas un buen día!!");
		
		sc.close();
		
		
	}

}
