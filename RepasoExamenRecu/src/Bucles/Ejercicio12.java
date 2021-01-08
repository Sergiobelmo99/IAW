package Bucles;

import java.util.Scanner;

public class Ejercicio12 {

	// Se dice que un número natural es perfecto si es igual a la suma de sus
	// divisores propios (divisores menores que el número). El 6 es perfecto porque
	// 6 = 1 + 2 + 3. El 28 es perfecto porque 28 = 1 + 2 + 4 + 7 + 14. Pida un
	// número e indique si es perfecto

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int suma = 0;

		System.out.println("Introduce Número: ");
		numero = sc.nextInt();
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
				suma = suma + i;
			}
		}
		if (suma == numero) {
			System.out.println("El número " + numero + " es perfecto");
		} else {
			System.out.println("El número " + numero + " no es perfecto");
		}

	}

}
