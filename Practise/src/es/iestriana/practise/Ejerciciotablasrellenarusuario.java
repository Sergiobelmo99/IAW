package es.iestriana.practise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejerciciotablasrellenarusuario {

	// Crear una tabla de n elementos. Pidiendo al usuario un valor entre 0 y n-1. y
	// ordenarla.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad;

		do {
			System.out.println("Introduce la cantidad de números: ");
			cantidad = sc.nextInt();

			if (cantidad <= 0) {
				System.out.println("Los datos introducidos no son correctos");
			}
		} while (cantidad <= 0);

		int[] tabla = new int[cantidad];
		RellenaTabla(tabla);

	}

	private static void RellenaTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
			System.out.println(tabla[i]);

		}
		Arrays.sort(tabla);
		System.out.println("\n" + "Tabla Ordenada " + Arrays.toString(tabla));
	}
}
