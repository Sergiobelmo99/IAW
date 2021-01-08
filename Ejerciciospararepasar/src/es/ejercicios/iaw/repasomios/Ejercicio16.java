package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio16 {

	/*
	 * Pide un número (que debe estar entre 0 y 10) y muestra la tabla de
	 * multiplicar para ese número.
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = 0;
		
		
		System.out.println("Introduce número: ");
		numero = sc.nextInt();
		System.out.println("La tabla del " + numero + " es :");

		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "*" + i + "=" + numero * i);
		}

	}

}
