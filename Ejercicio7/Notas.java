package Ejercicio7;

import java.util.Scanner;

public class Notas {
	
	private int[] notas;
	
	
	public Notas(int[]notas) {
		
		this.notas = notas;
		
	}
	
	public void leer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 5 notas");
		
		for (int i = 0; i < notas.length; i++) {
			
			notas[i]=sc.nextInt();
			
		}
		
		sc.close();
		
	}
	
	public int media() {
		
		int total = 0;
		int cont = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			total = total+notas[i];
			
			cont = cont+1;
			
		}
		
		int media = total/cont;
		
		return media;
		
	}
	
	public void mostrar() {
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(notas[i]);
			
		}
		
	}

}
