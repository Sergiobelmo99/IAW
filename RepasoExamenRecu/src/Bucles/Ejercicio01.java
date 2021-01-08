package Bucles;

import java.util.Scanner;

public class Ejercicio01 {

	// Lea un número y muestre su cuadrado, repita el proceso hasta que se
	// introduzca un número negativo.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce Numero: ");
			numero = sc.nextInt();
			if (numero > 0) {
				System.out.println("El cuadrado de número " + numero + " es: " + Math.pow(numero, 2));

			} else {
				System.out.println("Número inválido, inténtelo de nuevo");
			}

		} while (numero >= 0);
		sc.close();

	}

}
