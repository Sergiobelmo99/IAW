package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio23 {

	/*
	 * Pedir 5 n�meros e indicar si alguno es un m�ltiplo de 3.
	 */
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numeros;
		int multiplo;
		
		
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Introduce N�meros: ");
			numeros=sc.nextInt();
			if(numeros%3==0) {
				System.out.println("Es m�ltiplo de 3" );
			}else 
				System.out.println("No es m�ltiplo de 3");
		}
		

	}

}
