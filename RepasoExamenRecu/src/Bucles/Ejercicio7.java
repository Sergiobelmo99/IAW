package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

	// Dise�e una aplicaci�n que muestre las tablas de multiplicaci�n de 1 a 10.
	// Adem�s, pregunte al usuario qu� tabla quiere mostrar

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
