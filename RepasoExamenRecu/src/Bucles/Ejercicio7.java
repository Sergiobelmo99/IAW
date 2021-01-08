package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

	// Diseñe una aplicación que muestre las tablas de multiplicación de 1 a 10.
	// Además, pregunte al usuario qué tabla quiere mostrar

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce tabla: ");
			numero = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
				int multi = numero * i;
				System.out.println(numero + "*" + i+ "=" +multi);
			}
		} while (numero >= 1 && numero <= 10);

	}

}
