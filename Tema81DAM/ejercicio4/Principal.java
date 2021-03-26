package ejercicio4;

/**
 * @author David Ortola
 * Ejercicio 4 Tema 8 - Herencia
 * Main
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		//Declaracion de variables para hacer la suma de los productos
		
		double pElectrodomesticos = 0;
		 double pTelevison = 0;
		 double pLavadora = 0;
		 
		 //Declaracion del array y creacion de los objetos
		
		  Electrodomestico electrodomesticos[]=new Electrodomestico[10];
		  
		  electrodomesticos[0]= new Lavadora();
		  electrodomesticos[1]= new Lavadora(200, 40);
		  electrodomesticos[2]= new Lavadora(20, 201, 70, "ROJO", "B");
		  electrodomesticos[3]= new Television();
		  electrodomesticos[4]= new Television(200, 30);
		  electrodomesticos[5]= new Television(41, true, 100, 40, "gris", "A");
		  electrodomesticos[6]= new Electrodomestico();
		  electrodomesticos[7]= new Electrodomestico(150, 20);
		  electrodomesticos[8]= new Electrodomestico("azul", 300, 90, "F");
		  electrodomesticos[9]= new Television(30, false, 100, 10, "BLANCO", "C");
		  
		  //Suma de los productos
		  
		  for (int i = 0; i < electrodomesticos.length; i++) {
			  
			 if(electrodomesticos[i] instanceof Lavadora) {
				 
				 pLavadora = electrodomesticos[i].precioFinal() + pLavadora;
				 
			 }else if(electrodomesticos[i] instanceof Television) {
					 
					 pTelevison = electrodomesticos[i].precioFinal() + pTelevison;
				 
			 }else {
				 
				 pElectrodomesticos = electrodomesticos[i].precioFinal() + pElectrodomesticos;
				 
			 }
			
		}
		  
		  //Resultado final
		  
		  System.out.println("El precio de todas las lavadoras es "+pLavadora+"€");
		  System.out.println("El precio de todas las televisiones es "+pTelevison+"€");
		  System.out.println("El precio del resto de electrodomesticos es "+pElectrodomesticos+"€");
		  
		  
		  
	}

}
