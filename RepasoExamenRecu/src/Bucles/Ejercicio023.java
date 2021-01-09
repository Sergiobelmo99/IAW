package Bucles;

import java.util.Scanner;

public class Ejercicio023 {

	// Pedir 5 números e indicar si alguno es un múltiplo de 3.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce 5 Números: ");
			numero = sc.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				System.out.println("Los siguientes números son múltiplos de 3: " + numero);
			}

		}

	}

}
