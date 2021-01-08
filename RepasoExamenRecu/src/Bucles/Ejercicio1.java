package Bucles;

import java.util.Scanner;

public class Ejercicio1 {

	// Pide 5 números. Mostrar el promedio de los números positivos, el promedio de
	// los números negativos y el número de ceros.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double num = 0;
		double sumaneg = 0;
		double sumapos = 0;
		int contadorpos = 0;
		int contadorneg = 0;
		int cont0 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nº " + i + ": ");
			num = sc.nextInt();
			if (num > 0) {
				sumapos = sumapos + num;
				contadorpos++;

			} else if (num < 0) {
				sumaneg = sumaneg + num;
				contadorneg++;
			} else {
				cont0++;
				
			}

		}
		System.out.println("El promedio de los números positivos es: " + (sumapos / contadorpos));
		System.out.println("El promedio de los números negativos es: " + (sumaneg / contadorneg));
		System.out.println("Cantidad de ceros: " + cont0);

		sc.close();
	}
}
