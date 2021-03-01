package arranque;

import base.Profesor;

/**
 * @author David Ortolá Guerrero
 *
 */
public class Principal {

	public static void main(String[] args) {

		// Creación de los 3 profesores

		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor("Javier", "Hernandez_Perez", 59, "Historia", 21, 2, 657895423, 30);
		Profesor profesor3 = new Profesor(profesor2);

		// Modificar atributos del profesor copia

		profesor3.setEdad(39);
		profesor3.setNombre("Anabel");

		// Modificar atributos profesor por defecto

		profesor1.setNombre("Juan");
		profesor1.setApellidos("Garcia");
		profesor1.setEdad(62);
		profesor1.setMateria("Matematicas");
		profesor1.setHorasSemanales(24);
		profesor1.setTipo(1);
		profesor1.setTelefono(634907821);
		profesor1.sethMaximas(25);

		// Calcular los 3 sueldos
		
		System.out.println("Los sueldos de cada profesor son: ");
		
		System.out.println("Para profesor 1: ");

		System.out.println(profesor1.calcularSueldoMensual()+"€");
		
		System.out.println("Para profesor 2: ");
		
		System.out.println(profesor2.calcularSueldoMensual()+"€");
		
		System.out.println("Para profesor 3: ");
		
		System.out.println(profesor3.calcularSueldoMensual()+"€");
		
		// Sumar 5h a profesor2 y nuevo sueldo
		
		System.out.println("El nuevo sueldo para profesor 2 es:");

		profesor2.sumarHoras(5);
		System.out.println(profesor2.calcularSueldoMensual()+"€");
		
		// Cuantas horas puede impartir cada profesor
		
		System.out.println("La cantida de horas que les queda a cada uno son: ");

		System.out.println(profesor1.porlmpartir()+"h");
		System.out.println(profesor2.porlmpartir()+"h");
		System.out.println(profesor3.porlmpartir()+"h");

	}

}
