package Bucles;

import java.util.Scanner;

public class Ejercicio024 {

	// Dise�e una aplicaci�n que muestre las tablas de multiplicaci�n del 1 al 10.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int multi = 0;

		for (int j = 1; j <= 10; j++) {
			System.out.println("Introduce una tabla ha mostrar: ");
			numero = sc.nextInt();
			if (numero >= 1 && numero <= 10) {
				System.out.println("La tabla del " + numero + " Es:");
				for (int i = 0; i <= 10; i++) {
					multi = numero * i;

					System.out.println(numero + " * " + i + " = " + multi);
				}
			} else {
				System.out.println("El n�mero " + numero+ " introducido es incorrecto ,Introduce n�mero entre 1 y 10.");
			}
		}

		sc.close();

	}

}
