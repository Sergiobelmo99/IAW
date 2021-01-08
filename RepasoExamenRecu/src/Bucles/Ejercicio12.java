package Bucles;

import java.util.Scanner;

public class Ejercicio12 {

	// Se dice que un n�mero natural es perfecto si es igual a la suma de sus
	// divisores propios (divisores menores que el n�mero). El 6 es perfecto porque
	// 6 = 1 + 2 + 3. El 28 es perfecto porque 28 = 1 + 2 + 4 + 7 + 14. Pida un
	// n�mero e indique si es perfecto

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int suma = 0;

		System.out.println("Introduce N�mero: ");
		numero = sc.nextInt();
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
				suma = suma + i;
			}
		}
		if (suma == numero) {
			System.out.println("El n�mero " + numero + " es perfecto");
		} else {
			System.out.println("El n�mero " + numero + " no es perfecto");
		}

	}

}
