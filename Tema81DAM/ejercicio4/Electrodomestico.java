package ejercicio4;

/**
 * @author David Ortola
 * Ejercicio 4 Tema 8 - Herencia
 * Electrodomestico
 *
 */
public class Electrodomestico {
	
	//Atributos

	private double precioBase;
	private String color;
	private double peso;
	private String consumoEnergetico;
	
	//Constructor por defecto

	public Electrodomestico() {

		color = "blanco";
		consumoEnergetico = "F";
		peso = 5;
		precioBase = 100;

	}
	
	//Constructor con precio y peso, el resto por defecto

	public Electrodomestico(double precio, double peso) {
		this();
		this.peso = peso;
		this.precioBase = precio;

	}
	
	//Constructor con todo

	public Electrodomestico(String color, double precio, double peso, String consumo) {

		
		//El color se puede introducir tanto en mayus como minus pero lo transformo en minus para el metodo
		
		this.color = color.toLowerCase();
		comprobarColor();
		this.precioBase = precio;
		this.peso = peso;
		this.consumoEnergetico = consumo;

		comprobarConsumo();
		
		//getters and setters

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	
	//Metodo privado para comprobar que el consumo sea el correcto
	
	private void comprobarConsumo() {

		if (consumoEnergetico != "A" || consumoEnergetico != "B" || consumoEnergetico != "C" || consumoEnergetico != "D"
				|| consumoEnergetico != "E" || consumoEnergetico != "F") {

			consumoEnergetico = "F";

		}

	}
	
	//Metodo privado para comprobar que el color sea correcto

	private void comprobarColor() {

		if (color != "blanco" || color != "negro" || color != "azul" || color != "rojo" || color != "gris") {

			color = "blanco";

		}

	}
	
	//Metodo precio final
	
	public double precioFinal() {
		
		double precioB = precioBase;
		
		if(consumoEnergetico.equals("F")) precioB = precioB + 10;
		if(consumoEnergetico.equals("E")) precioB = precioB + 30;
		if(consumoEnergetico.equals("D")) precioB = precioB + 50;
		if(consumoEnergetico.equals("C")) precioB = precioB + 60;
		if(consumoEnergetico.equals("B")) precioB = precioB + 80;
		if(consumoEnergetico.equals("A")) precioB = precioB + 100;
		
		if(peso<=19) precioB += 10;
		if(peso>19 && peso<50) precioB += 50;
		if(peso>=50 && peso<80) precioB += 80;
		if(peso>=80) precioB += 100;
		
		return precioB;
		
			
		
	}

}



















