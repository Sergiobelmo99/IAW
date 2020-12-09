package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio20 {

	
	/*
	 * Pida un número N, escriba N sueldos, y muestre el salario máximo.
	 */
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int sueldo=0;
		int max=0;
		
		do {
			System.out.println("Introduce sueldos ");
			sueldo=sc.nextInt();
			
			if(sueldo>max) {
				max = sueldo;
			}
			
			
		} while (sueldo!=0);
		
		System.out.println("El sueldo máximo es: " +max);

	}

}
