package Bucles;

import java.util.Scanner;

public class Ejercicio022 {

	// Pedir 5 notas a los estudiantes y decir al final si hay algún fallo.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int nota;
		boolean aprobado = true;
		for (int i = 1; i <= 5; i++) {
			do {
				System.out.println("Introduzca una nota");
				nota = sc.nextInt();
				if (nota < 0 || nota > 10) {
					System.out.println("La nota introdeucida no es correcta");
				}
			} while (nota < 0 || nota > 10);
			if (nota < 5) {
				aprobado = false;
			}
		}
		if (aprobado) {
			System.out.println("No ha introducido ningun suspenso ");
		} else {
			System.out.println("Ha introducido, al menos. un suspenso");
		}
	}

}
