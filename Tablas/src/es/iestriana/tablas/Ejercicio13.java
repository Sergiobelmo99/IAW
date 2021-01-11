package es.iestriana.tablas;

import java.util.Scanner;

public class Ejercicio13 {

	// Escribe un programa que diga si una tabla de números enteros es un
	// palíndromo. Se dice que palíndromo si se lee igual de derecha a izquierda que
	// de izquierda a derecha.

	private static Scanner sc = new Scanner(System.in);
	private static int[] numeros = new int[10];

	public static void main(String[] args) {
		boolean palindromo = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el numero " + i + " de 10");
			numeros[i] = sc.nextInt();
		}
		palindromo = VerPalindromo(numeros);
		if (palindromo) {
			System.out.println("Si es un palindromo");

		} else
			System.out.println("No es un palindromo");

	}

	private static boolean VerPalindromo(int[] numeros) {
		boolean palindromo = true;
		int indice = 0;
		while (palindromo && indice < numeros.length / 2) {
			if (numeros[indice] == numeros[numeros.length - 1 - indice]) {
				indice++;
			} else
				palindromo = false;
		}

		return palindromo;
	}

}