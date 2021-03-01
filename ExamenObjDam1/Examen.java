
/**
 * @author David Ortolá Guerrero
 *
 */
public class Examen {
	
	//Atributos
	
	private String asignatura;
	private String aula;
	private Fecha fecha;
	private Hora hora;
	
	//Constructor
	
	public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
		
		this.asignatura=asignatura;
		this.aula = aula;
		this.fecha = fecha;
		this.hora = hora;
		
	}

	//Getters/Setters
	
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	//Método
	
	public String toString() {
		
		String asignatura=this.asignatura;
		String aula = this.aula;
		String fecha = this.fecha.toString();
		String hora = this.hora.toString();
		
		String datosExamen ="Examen de "+asignatura+" en "+aula+" el dia "+fecha+" a las "+hora;
		
		return datosExamen;
		
		
	}

}


