package Bucles;

import java.util.Scanner;

public class Ejercicio027 {

	// Hacer un programa que nos pida un número n, y nos diga cuántos números hay
	// entre 1 y n que sean primos.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, ContadorDivisiones = 0;

		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		for (int i = 1; i < numero; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					ContadorDivisiones++;
				}

			}

			if (ContadorDivisiones == 1) {
				System.out.print(i + " ");
			}
			ContadorDivisiones = 0;
		}

	}

}
