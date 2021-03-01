
/**
 * @author David Ortolá Guerrero
 *
 */
public class Hora {

	// Atributos

	private int horas;
	private int minutos;

	// Constructor

	public Hora(int horas, int minutos) {

		if (minutos > 59) {

			minutos = 0;

		}

		this.horas = horas;
		this.minutos = minutos;

		// Fique 8 y 0 per el mateix motiu que en fecha perque no sabia que posar

		if (validarHora()) {

		} else {

			this.horas = 8;
			this.minutos = 0;

		}

	}

	// Getters/Setters

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	// Métodos

	public String toString() {

		String hora;

		hora = horas + ":" + minutos;

		return hora;

	}

	public boolean validarHora() {

		boolean vale = false;

		if (horas >= 8 && horas <= 14) {

			vale = true;

		}

		return vale;

	}

}
