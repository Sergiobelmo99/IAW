package Bucles;

import java.util.Scanner;

public class Ejercicio02 {

	// Leer un número e indicar si es positivo o negativo. El proceso se repetirá
	// hasta que se introduzca un 0.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce Número: ");
			numero = sc.nextInt();

			if (numero > 0) {
				System.out.println("El número " + numero + " es positivo :)");
			} else if (numero == 0) {
				System.out.println("El número " + numero + " es inválido");
			} else {
				System.out.println("El número " + numero + " es negativo :(");
			}

		} while (numero != 0);

		sc.close();

	}

}
