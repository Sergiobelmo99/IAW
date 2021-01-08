package es.iestriana.iaw.examenb;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Una empresa de hosting tiene ordenadores similares dentro de camiones. Cada
	 * cami�n puede cargar como m�ximo 30000 kg. Realiza un programa que solicite el
	 * peso de un ordenador (int) y averig�e cu�ntos ordenadores puede cargar en el
	 * cami�n. Las �nicas operaciones aritm�ticas que se pueden utilizar son la suma
	 * y/o la resta. (3,3 Ptos) 3.
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int peso;
		do {
			System.out.println("Introduzaca el peso del ordenador: ");
			peso = sc.nextInt();
			if (peso <= 0) {
				System.out.println("El peso introducido no es correcto.");
			}

		} while (peso <= 0);

		CalculaCantidad(peso);

		sc.close();
	}

	private static void CalculaCantidad(int peso) {
		int cantidad = 0, suma = 0;
		while (suma < 30000) {
			if ((30000 - suma) >= peso) {
				cantidad++;
			}
			suma = suma + peso;
		}
		System.out.println("En el cami�n caben un total de: " + cantidad + " ordenadores");
	}
}