
public class Principal {

	public static void main(String[] args) {
		
		Fecha fecha = new Fecha(20, 2, 2020);
		Hora hora = new Hora(12, 0);
		
		Examen examen = new Examen("Java", "aula informatica 4", fecha, hora);
		System.out.println(examen.toString());

	}

}
