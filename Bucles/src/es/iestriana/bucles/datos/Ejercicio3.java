package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Debes solicitar un n�mero positivo. Mostrar todos los n�meros desde solicitado hasta 0
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero = 0;
		do {
			System.out.println("N�: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		mostrarDesdeNumeroACero(numero);
		
		sc.close();
	}

	private static void mostrarDesdeNumeroACero(int numero) {
		for (int i = numero; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
