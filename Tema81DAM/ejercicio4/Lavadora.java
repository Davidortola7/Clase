package ejercicio4;

/**
 * @author David Ortola
 * Ejercicio 4 Tema 8 - Herencia
 * Lavadora
 *
 */
public class Lavadora extends Electrodomestico {
	
	//Atributos

	private int carga;
	
	//Constructor por defecto

	public Lavadora() {

		carga = 5;

	}
	
	//Constructor con precio y carga

	public Lavadora(double precio, double peso) {
	
		super(precio, peso);
		carga = 5;

	}
	
	//Constructor con todos los datos

	public Lavadora(int carga, double precio, double peso, String color, String consumo) {

		super(color, precio, peso, consumo);

		this.carga = carga;

	}
	
	//getters and setters

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	//Metodo precio final

	public double precioFinal() {
		
		double resu = super.precioFinal();
		
		if(carga>30) resu=+30;
		
		return resu;
		
	}
	
}
