package es.iestriana.iaw.examenb;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * 1. Programa que solicita tres n�meros y realiza las siguientes acciones: -
	 * Muestra el valor central de los tres valores num�ricos - Muestra si alguno de
	 * los valores es m�ltiplo de otro de los valores - Debe mostrar un mensaje
	 * diciendo si el valor central est� m�s cerca del menor que del mayor. Por
	 * ejemplo, si los tres valores fueran 1,15,200 deber�a decir que
	 * "El valor central 15 est� m�s cerca del valor 1" - Muestre el valor de la
	 * multiplicaci�n de todos los divisores del valor central
	 * 
	 */

	private static Scanner sc = new Scanner(System.in);
	private static int[] tabla = new int[3];

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			System.out.println("Intoduzca el n�mero " + i);
			tabla[i - 1] = sc.nextInt();
		}
		ValorCentral(tabla);
		EsMultiplo(tabla);
		MasCerca(tabla);
		Divisores(tabla);

	}

	private static void Divisores(int[] tabla) {
		int resultado = 1;
		for (int i = 1; i < tabla[1]; i++) {
			if (tabla[1] % i == 0) {
				resultado = resultado * i;
			}
		}
		System.out.println("La multiplicaci�n de los divisores del valor central " + tabla[1] + " es " + resultado);
	}

	private static void MasCerca(int[] tabla) {

		if ((tabla[1] - tabla[0]) > (tabla[2] - tabla[1])) {
			System.out.println("El valor central " + tabla[1] + " est� mas cerca del " + tabla[2]);
		} else
			System.out.println("El valor central " + tabla[1] + " est� mas cerca de " + tabla[0]);
	}

	private static void EsMultiplo(int[] tabla) {
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (tabla[j] % tabla[i] == 0 && tabla[i] != tabla[j]) {
					System.out.println("El numero " + tabla[j] + " es multiplo del n�mero " + tabla[i]);
				}
			}
		}

	}

	private static void ValorCentral(int[] tabla) {
		Arrays.sort(tabla);
		System.out.println("El valor central de los tres n�meros es: " + tabla[1]);

	}
}
