package Tablas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	// Meter 10 números aleatorios en una tabla y pedir al usuario un número y decir
	// cuantas veces está en ella.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int buscar, veces = 0;
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
			System.out.print(numeros[i]+ " ");
		}
		System.out.println("\n" + "Introduce un número entre 0 y 9: ");
		buscar = sc.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == buscar) {
				veces++;
			}

		}
		

		System.out.println("El numero " + buscar + " Se ha introducido " + veces + " veces");

		sc.close();

	}
}