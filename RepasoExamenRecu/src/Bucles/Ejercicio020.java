package Bucles;

import java.util.Scanner;

public class Ejercicio020 {

	// Pida un número N, escriba N sueldos, y muestre el salario máximo.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int salario, maximo = 0, numero;
		System.out.println("Indique el número de salarios que va a introducir: ");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {

			do {
				System.out.println("Introduzca el salario " + i + " :");
				salario = sc.nextInt();
				if (salario <= 0) {
					System.out.println("Salario introducido incorrecto. Repítalo: ");
				}
			} while (salario <= 0);

			if (salario > maximo) {
				maximo = salario;
			}
		}
		System.out.println("El salario máximo introducido es: " + maximo);
		sc.close();
	}

}