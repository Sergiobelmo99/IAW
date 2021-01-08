package Bucles;

import java.util.Scanner;

public class Ejercicio07 {

	// Pedir n�meros hasta que se introduzca un negativo, y calcular la media.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int suma = 0;
		int media = 0;
		int contador = 0;

		do {
			System.out.println("Introduce N�mero: ");
			numero = sc.nextInt();
			if (numero > 0) {
				suma = suma + numero;
				contador++;

			} else {
				System.out.println("Introduce n�mero v�lido");

			}
		} while (numero >= 0);

		System.out.println("La suma de los n�meros es: " + suma + " Y la media es: " + (suma / contador));
		sc.close();
	}

}

