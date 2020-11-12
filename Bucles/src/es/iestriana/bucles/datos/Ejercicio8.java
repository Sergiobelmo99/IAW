package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * P�dale al usuario un n�mero e indique cu�ntos n�meros primos hay entre 1 y el n�mero
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("N�: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int contadorDePrimos = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (esPrimo(i)) {
				contadorDePrimos++;
			}
		}
		
		System.out.println("Primos entre 1 y " + 
				numero + " son: " + contadorDePrimos);
		
		sc.close();
	}

	private static boolean esPrimo(int n) {
		boolean primo = true;
		
		for (int j = 2; j < n; j++) {
			if (n%j==0) {
				primo = false;
			}
		}
		
		return primo;

	}

}
