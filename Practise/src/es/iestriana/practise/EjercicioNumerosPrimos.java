package es.iestriana.practise;

import java.util.Scanner;

public class EjercicioNumerosPrimos {

	// Solicite al usuario un número e indique cuántos números primos hay entre el 1
	// y el número

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int contadorPrimos = 0;

		do {
			System.out.println("Introduce número: ");
			numero = sc.nextInt();
			for (int i = 1; i <= numero; i++) {
				if (esPrimo(i)) {
					contadorPrimos++;
				}

			}
			System.out.println("Primos entre 1 y " + numero + " son: " + contadorPrimos);

		} while (numero > 0);
	}

	private static boolean esPrimo(int n) {
		boolean primo = true;

		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				primo = false;
			}
		}

		return primo;

	}

}
