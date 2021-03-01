import java.util.Scanner;

//Ejercicio 1 Examen 2ª evaluacion, David Ortolá Guerrero

public class Ejercicio1Menu {

	public static int sumar(int num1, int num2) {

		int resultadoSuma;

		resultadoSuma = num1 + num2;

		return resultadoSuma;

	}

	public static int restar(int num1, int num2) {

		int resultadoResta;

		resultadoResta = num1 - num2;

		return resultadoResta;

	}

	public static int multiplicar(int num1, int num2) {

		int resultadoMulti;

		resultadoMulti = num1 * num2;

		return resultadoMulti;

	}

	public static int dividir(int num1, int num2) {

		int resultadoDiv;

		resultadoDiv = num1 / num2;

		return resultadoDiv;

	}

	public static void tablaMult(int num) {

		int res;

		for (int i = 0; i <= 10; i++) {

			res = num * i;

			System.out.println(num + " x " + i + " = " + res);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenidos a nuestra calculadora para dos números enteros.");
		System.out.println("Introduzca el numero correspondiente a la operación que desea realizar:");

		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Mostrar tabla de multiplicar");
		System.out.println("6. Salir de la calculadora");

		int opcion = sc.nextInt();

		do {

			if (opcion == 1) {

				System.out.print("Introduce el primer número: ");
				int n1Suma = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				int n2Suma = sc.nextInt();

				System.out.println("La suma de " + n1Suma + " + " + n2Suma + " = " + sumar(n1Suma, n2Suma));

			} else if (opcion == 2) {

				System.out.print("Inroduce el primer número: ");
				int n1Resta = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				int n2Resta = sc.nextInt();

				System.out.println("La resta de "+ n1Resta + " - "+n2Resta+" = "+restar(n1Resta, n2Resta));

			}else if(opcion == 3){

				System.out.print("Inroduce el primer número: ");
				int n1Mult = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				int n2Mult = sc.nextInt();

				System.out.println("La multiplicación "+ n1Mult + " x "+n2Mult+" = "+multiplicar(n1Mult, n2Mult));

			}else if (opcion == 4) {

				System.out.print("Inroduce el primer número: ");
				int n1Div = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				int n2Div = sc.nextInt();

				System.out.println("La división de "+ n1Div + " : "+n2Div+" = "+dividir(n1Div, n2Div));

			}else if(opcion == 5) {

				System.out.println("Introduce un numero para visualizar su tabla de multiplicar.");
				int numTabla = sc.nextInt();

				tablaMult(numTabla);

			}
			
			System.out.println("Introduzca otra operacion a realizar (1-Sumar; 2-Restar; 3-Multiplicar; 4-Dividir; 5-Tabla de multiplicar; 6-Salir)");
			
			opcion = sc.nextInt();

		}while(opcion > 0 && opcion < 6);
		
		if (opcion == 6) {
			System.out.println("¡Muchas gracias por utilizar nuestra calculadora!");
			System.out.println("¡KEEP CALM & CODE JAVA!");
			
		}
		
		sc.close();

	}

}
