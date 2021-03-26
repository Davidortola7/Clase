package ejercicio4;

/**
 * @author David Ortola
 * Ejercicio 4 Tema 8 - Herencia
 * Television
 *
 */
public class Television extends Electrodomestico {
	
	//Atributos
	
	private int resolucion;
	private boolean smartTV;
	
	//Constructor por defecto
	
	public Television() {
		
		resolucion = 20;
		smartTV = false;
		
	}
	
	//Constructor con solo precio y peso el resto por defecto
	
	public Television(double precio, double peso) {
	
		super(precio, peso);
		resolucion = 20;
		smartTV = false;
		
	}
	
	//Constructor con todos los atributos por parametro
	
	public Television(int resolucion, boolean smartTV, double precio, double peso, String color, String consumo) {
		
		
		super(color, precio, peso, consumo);
		
		this.resolucion = resolucion;
		this.smartTV = smartTV;
		
		//getters and setters
		
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	//Metodo de precio final
	
	public double precioFinal() {
		
		double precioT = super.precioFinal();
		
		if(smartTV) precioT =+ 50;
		
		if(resolucion>40) precioT = precioT+(precioT*1.3);
		
		return precioT;
		
	}

}
