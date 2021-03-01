
/**
 * @author David Ortola Guerrero
 *
 */
public class Fecha {

	// Atributos

	private int dia;
	private int mes;
	private int a�o;

	// Constructor

	public Fecha(int dia, int mes, int a�o) {

		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;

		// Fique que si no val la fecha se pose en ixe perque no sabia que posar

		if (validarFecha()) {

		} else {

			this.a�o = 2021;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	// M�todos

	public String toString() {

		String fecha;

		fecha = dia + "-" + mes + "-" + a�o;

		return fecha;

	}

	public boolean validarFecha() {

		boolean vale = false;

		if (dia <= 30 && dia >= 1) {

			if (mes <= 12 && mes >= 1) {

				if (a�o <= 2021 && a�o >= 2018) {

					vale = true;

				}

			}

		}

		return vale;

	}

}
