package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	// Programa que muestra y calcula el producto de los primeros números impares

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad = 0;
		do {
			System.out.println("CUÁNTOS: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);

		int i = 1, productoFinal = 1;
		while (cantidad > 0) {
			productoFinal = productoFinal * i;
			i = i + 2;

			cantidad--;
		}

		System.out.println("Producto de Impares: " + productoFinal);

		sc.close();
	}

}
