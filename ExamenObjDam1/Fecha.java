
/**
 * @author David Ortola Guerrero
 *
 */
public class Fecha {

	// Atributos

	private int dia;
	private int mes;
	private int año;

	// Constructor

	public Fecha(int dia, int mes, int año) {

		this.año = año;
		this.mes = mes;
		this.dia = dia;

		// Fique que si no val la fecha se pose en ixe perque no sabia que posar

		if (validarFecha()) {

		} else {

			this.año = 2021;
			this.mes = 1;
			this.dia = 1;

		}

	}

	// Getters/Stetters

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// Métodos

	public String toString() {

		String fecha;

		fecha = dia + "-" + mes + "-" + año;

		return fecha;

	}

	public boolean validarFecha() {

		boolean vale = false;

		if (dia <= 30 && dia >= 1) {

			if (mes <= 12 && mes >= 1) {

				if (año <= 2021 && año >= 2018) {

					vale = true;

				}

			}

		}

		return vale;

	}

}
