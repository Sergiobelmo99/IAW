package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {


	
	/*
	 * 8. Crear una tabla de n elementos. Mostrar la tabla ordenada
	 */
	private static int [] numeros = new int[20];
	
	public static void main(String[] args) {
		Arrays.sort(numeros);
		rellenarTabla();
	}

	private static void rellenarTabla() {
	
		Random random = new Random();
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = random.nextInt(100);
			
		}
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		
		
		
		
		
		
	}

}
