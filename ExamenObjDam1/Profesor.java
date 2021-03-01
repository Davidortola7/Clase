package base;

/**
 * @author David Ortolá Guerrero
 *
 */
public class Profesor {

	// Atributos

	private String nombre;
	private String apellidos;
	private int edad;
	private String materia;
	private int horasSemanales;
	private int tipo;
	private int telefono;
	private int hMaximas;

	// Constructores

	public Profesor() {

		if (edad > 60) {

			hMaximas = 25;
		}

	}

	public Profesor(String nombre, String apellidos, int edad, String materia, int horasSemanales, int tipo,
			int telefono, int hMaximas) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.materia = materia;
		this.horasSemanales = horasSemanales;
		this.tipo = tipo;
		this.telefono = telefono;
		this.hMaximas = hMaximas;

		if (edad > 60) {

			hMaximas = 25;
		}

	}

	public Profesor(Profesor p) {
		
		this.apellidos = p.apellidos;
		this.edad = p.edad;
		this.hMaximas = p.hMaximas;
		this.horasSemanales = p.horasSemanales;
		this.materia = p.materia;
		this.nombre = p.nombre;
		this.telefono = p.telefono;
		this.tipo = p.tipo;

	}

	// Getters/Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int gethMaximas() {
		return hMaximas;
	}

	public void sethMaximas(int hMaximas) {
		this.hMaximas = hMaximas;
	}

	// Metodos

	public int calcularSueldoMensual() {

		int total = 0;

		if (tipo == 1) {

			if (horasSemanales > 20) {

				total = (25 * horasSemanales) * 4;
				
				total = total+25;

			} else {

				total = (28 * horasSemanales) * 4;
				
				total = total+25;

			}


		} else if (tipo == 2) {

			if (horasSemanales > 20) {

				total = (22 * horasSemanales) * 4;

			} else {

				total = (25 * horasSemanales) * 4;

			}

		}

		return total;

	}

	public void sumarHoras(int horasAñadir) {

		if (horasAñadir < 0) {

			System.out.println("Introduce una hora correcta");

		} else {

			horasSemanales = horasSemanales + horasAñadir;

			if (horasSemanales > hMaximas) {

				horasSemanales = hMaximas;

			}

		}

	}

	public int porlmpartir() {

		int total;

		total = hMaximas - horasSemanales;

		return total;

	}

}
