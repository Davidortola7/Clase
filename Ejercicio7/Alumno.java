package Ejercicio7;

public class Alumno {

	private String nombre;
	private int nEsxpediente;
	// private Notas notasAlumnos

	public Alumno() {

	}

	public Alumno(String nombre, int nExpediente) {

		this.nEsxpediente = nExpediente;
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnEsxpediente() {
		return nEsxpediente;
	}

	public void setnEsxpediente(int nEsxpediente) {
		this.nEsxpediente = nEsxpediente;
	}

}
