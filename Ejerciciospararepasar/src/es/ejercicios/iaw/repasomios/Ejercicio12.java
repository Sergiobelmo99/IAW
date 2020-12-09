package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * 12 Pide un número y calcula su factorial.
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		int factorial=1;
		
			System.out.println("Introduce número: ");
			numero =sc.nextInt();
			for (int i = 1; i <=numero; i++) {
				factorial = factorial*i;
			}
			System.out.println("El factorial del número es : " + factorial);
		sc.close();
	}
	
}
