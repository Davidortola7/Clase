import java.util.Scanner;

public class Ejercicio2_DavidOrtola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int cont = 0;
		int edad_fin = 0;
		double altura_fin = 0;
		String nombre;
		
		System.out.println("Bienvenidos al programa de inserción de personas.");
		
		while(x==1) {
			System.out.println("Introduzca los datos de la persona:");
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Edad: ");
			int edad = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			cont=cont+1;
			edad_fin=edad_fin+edad;
			altura_fin=altura_fin+altura;
			
			
			
			System.out.println("--- Persona "+cont+" ---");
			
			System.out.println("Nombre: "+nombre);
			System.out.println("Edad: "+edad);
			System.out.println("Altura: "+altura);
			if(edad>=18) {
				System.out.println("La persona introducida es mayor de edad");
			}else {
				System.out.println("La persona introducida es menor de edad");
			}
			System.out.println("-----------------");
			System.out.println("¿Desea continuar? (Pulse 1 para continuar. Pulse 0 para salir)");
			x=sc.nextInt();
			if(x==0) {
				break;
			}
			if(x==1) {
				
			}
			
			sc.nextLine();
			
			
		}
		System.out.println("--- Gracias por usar el programa---");
		System.out.println("Número de personas introducidas:  "+cont);
		System.out.println("Media edad:                       "+(edad_fin/cont));
		System.out.println("Media altura:                     "+(altura_fin/cont));
		System.out.println("----------------------------------------");
		
		
		
		sc.close();
		
	}

}
