package Bucles;

import java.util.Scanner;

public class Ejercicio03 {

	// Leer los n�meros hasta que se introduzca un 0. Para cada uno indique si es
	// par o impar.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce N�mero: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				System.out.println("El n�mero " + numero + " Es par");

			} else {
				System.out.println("El n�mero " + numero + " Es impar");
			}

		} while (numero != 0);

	}

}
