package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * Pide un número y calcula su factorial
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero=0;
		
		do {
			System.out.println("Introduce Número: ");
			numero = sc.nextInt();
		} while (numero <=0);
		
		long factorial = 1;
		
		for (int i = numero; i >=1; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial: "+ factorial);
		
		sc.close();
		
	}

}
