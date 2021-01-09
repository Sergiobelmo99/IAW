package Bucles;

import java.util.Scanner;

public class Ejercicio020 {

	// Pida un n�mero N, escriba N sueldos, y muestre el salario m�ximo.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int salario, maximo = 0, numero;
		System.out.println("Indique el n�mero de salarios que va a introducir: ");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {

			do {
				System.out.println("Introduzca el salario " + i + " :");
				salario = sc.nextInt();
				if (salario <= 0) {
					System.out.println("Salario introducido incorrecto. Rep�talo: ");
				}
			} while (salario <= 0);

			if (salario > maximo) {
				maximo = salario;
			}
		}
		System.out.println("El salario m�ximo introducido es: " + maximo);
		sc.close();
	}

}