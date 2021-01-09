package Bucles;

import java.util.Scanner;

public class Ejercicio019 {

	// Dados 6 grados, escriba el n�mero de estudiantes aprobados, condicionados (=
	// 4) y reprobados.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int nota, aprobados = 0, suspensos = 0, condicionados = 0;

		for (int i = 1; i <= 6; i++) {
			do {
				System.out.println("Introduzca la nota del estudiante: " + i);
				nota = sc.nextInt();
				if (nota < 0 || nota > 10) {
					System.out.println("La nota introducida no es correcta. Rep�tala: ");
				}
			} while (nota < 0 || nota > 10);

			if (nota < 4) {
				suspensos++;
			} else if (nota == 4) {
				condicionados++;
			} else {
				aprobados++;
			}
		}
		System.out.println("El n�mero de estudiantes suspensos es; " + suspensos + "\n"
				+ "El n�mero de estudiantes condicionados es: " + condicionados + "\n"
				+ "El n�mero de estudiantes aprobados es: " + aprobados);
	}

}
