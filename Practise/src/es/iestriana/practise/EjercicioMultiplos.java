package es.iestriana.practise;

import java.util.Scanner;

public class EjercicioMultiplos {

	// Pedir 5 números e indicar si alguno es un múltiplo de 3.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce 5 números: ");
			numero = sc.nextInt();
			if (numero % 3 == 0) {
				System.out.println("Numero múltiplo de 3 " + numero);
			} else {
				System.out.println("No hay múltiplos de 3");
			}
		}

	}

}
