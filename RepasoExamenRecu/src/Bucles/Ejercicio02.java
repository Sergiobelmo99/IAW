package Bucles;

import java.util.Scanner;

public class Ejercicio02 {

	// Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir�
	// hasta que se introduzca un 0.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce N�mero: ");
			numero = sc.nextInt();

			if (numero > 0) {
				System.out.println("El n�mero " + numero + " es positivo :)");
			} else if (numero == 0) {
				System.out.println("El n�mero " + numero + " es inv�lido");
			} else {
				System.out.println("El n�mero " + numero + " es negativo :(");
			}

		} while (numero != 0);

		sc.close();

	}

}
