package es.iestriana.iaw.examenb;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	/*
	 * Rellena una tabla de 15 números. Muestra la tabla. Muestra el mayor, el menor
	 * y las posiciones en las que se encuentran.
	 */

	private static int[] tabla = new int[15];

	public static void main(String[] args) {
		RellenaTabla(tabla);
		System.out.println(Arrays.toString(tabla));
		CalculaMenor(tabla);
		CalculaMayor(tabla);

	}

	private static void CalculaMayor(int[] tabla) {
		int mayor = tabla[0], pos = 0;
		for (int i = 1; i < tabla.length; i++) {
			if (tabla[i] > mayor) {
				mayor = tabla[i];
				pos = i;
			}
		}
		System.out.println("El número mayor es " + mayor + " y esta en la posicion " + pos);

	}

	private static void CalculaMenor(int[] tabla) {
		int menor = tabla[0], pos = 0;
		for (int i = 1; i < tabla.length; i++) {
			if (tabla[i] < menor) {
				menor = tabla[i];
				pos = i;
			}
		}
		System.out.println("El número menor es " + menor + " y su posición es : " + pos);
	}

	private static void RellenaTabla(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}

	}

}