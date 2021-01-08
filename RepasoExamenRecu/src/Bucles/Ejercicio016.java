package Bucles;

import java.util.Scanner;

public class Ejercicio016 {

	// Pide un número (que debe estar entre 0 y 10) y muestra la tabla de
	// multiplicar para ese número.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce tabla a mostrar: ");
			numero = sc.nextInt();
			if (numero < 0 || numero > 10) {
				System.out.println("Inserte un número del 0 al 10");
			}
		} while (numero < 0 || numero > 10);

		System.out.println("La tabla del " + numero + " es: ");

		for (int i = 0; i <= 10; i++) {

			System.out.println(numero + " * " + i + " = " + numero * i);
		}
		sc.close();

	}

}
