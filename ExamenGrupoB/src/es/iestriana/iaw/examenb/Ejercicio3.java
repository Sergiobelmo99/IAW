package es.iestriana.iaw.examenb;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {


	/*
	 *  Rellena una tabla de 15 números. Muestra la tabla. Muestra el mayor, el menor y las posiciones en las que se encuentran.
	 */
	
	
	
	static int[] numAleatorios = new int[15];
	
	public static void main(String[] args) {
		
		rellenarArray();
		
		mayormenor();
		
		
	}



	private static void mayormenor() {
		int mayor;
		int menor;
		menor=mayor=numAleatorios[0];
		for (int i = 1; i < numAleatorios.length; i++) {
			if (numAleatorios[i]>mayor) {
				
				mayor=numAleatorios[i];
				
			}if (numAleatorios[i]<menor) {
				
				menor=numAleatorios[i];
				
			}
			
		}
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		
	}

	private static void rellenarArray() {
		Random random = new Random();
		for(int i = 0; i < numAleatorios.length; i++){
			numAleatorios[i] = random.nextInt(50);
		}
		System.out.println(Arrays.toString(numAleatorios));
		
	}
	
	

}
