package Tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10 {

	// Lee dos series de números n. Guárdelos en dos tablas. Ordena las tablas.
	// Fusión las 2 tablas en una tabla de 2 * n elementos para que esta tabla esté
	// ordenada

	private static int[] tabla1 = new int[10];
	private static int[] tabla2 = new int[10];
	private static int[][] tabla = new int[2][10];

	public static void main(String[] args) {

		RellenarTabla(tabla1);
		RellenarTabla(tabla2);
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));

		RellenaTab();
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");

			}
		}
	}

	private static void RellenaTab() {
		int cont1 = 0, cont2 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				if (cont1 < tabla[0].length && cont2 < tabla[0].length) {
					if (tabla1[cont1] <= tabla2[cont2]) {
						tabla[i][j] = tabla1[cont1];
						cont1++;
					} else {
						tabla[i][j] = tabla2[cont2];
						cont2++;
					}
				} else if (cont1 > tabla[0].length) {
					tabla[i][j] = tabla2[cont2];
					cont2++;
				} else {
					tabla[i][j] = tabla1[cont1];
					cont1++;
				}
			}
		}
	}

	private static void RellenarTabla(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(50);
		}

	}

}