package Bucles;

import java.util.Scanner;

public class Ejercicio07 {

	// Pedir números hasta que se introduzca un negativo, y calcular la media.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int suma = 0;
		int media = 0;
		int contador = 0;

		do {
			System.out.println("Introduce Número: ");
			numero = sc.nextInt();
			if (numero > 0) {
				suma = suma + numero;
				contador++;

			} else {
				System.out.println("Introduce número válido");

			}
		} while (numero >= 0);

		System.out.println("La suma de los números es: " + suma + " Y la media es: " + (suma / contador));
		sc.close();
	}

}

