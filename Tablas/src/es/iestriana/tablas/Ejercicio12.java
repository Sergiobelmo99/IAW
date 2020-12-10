package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	
	/*
	 * Escribe un programa que diga si una tabla de números enteros es un palíndromo. Se dice que palíndromo si se lee igual de derecha a izquierda que de izquierda a derecha.
	 */

	
		private static Scanner sc = new Scanner(System.in);
		private static int size = 0;

		public static void main(String[] args) {
		do {
		System.out.println("Please enter number of elements in the table (more than zero):");
		size = sc.nextInt();
		} while (size <= 0);

		int [] table = new int[size];
		fillTable(table);
		boolean palindrome = palindrome(table);
		System.out.println("It is " + palindrome + " that the array " + Arrays.toString(table) + " is a palindrome.");
		sc.close();

		}

		private static boolean palindrome(int[] table) {
		boolean palindrome = false;
		for (int i = 0; i < size/2; i++) {
		if (table[i] == table[size-i-1]) {
		palindrome = true;
		} else {
		palindrome = false;
		}
		}
		return palindrome;
		}

		private static void fillTable(int[] table) {
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter new element of Table:");
		table[i] = sc.nextInt();
		}	

	}

}
