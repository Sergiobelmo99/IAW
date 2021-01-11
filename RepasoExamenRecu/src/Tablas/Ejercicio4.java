package Tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

	// Lee 2 tablas de n números y mézclalo en una tercera tabla de la siguiente
	// manera: 1er de A, 1 de B, 2 de A, 2 de B, 3 de A, 3 de B, ...

	private static int[] TablaA = new int[10];
	private static int[] TablaB = new int[10];
	private static int[] TablaSuma = new int[20];

	public static void main(String[] args) {

		RellenarTablas();
		RellenarTablaSuma();
		System.out.println(Arrays.toString(TablaA));
		System.out.println(Arrays.toString(TablaB));
		System.out.println(Arrays.toString(TablaSuma));

	}

	private static void RellenarTablas() {

		for (int i = 0; i < TablaA.length; i++) {
			TablaA[i] = new Random().nextInt(50);
			TablaB[i] = new Random().nextInt(50);
		}

	}

	private static void RellenarTablaSuma() {
		int contador = 0;

		for (int i = 0; i < TablaA.length; i++) {
			TablaSuma[contador] = TablaA[i];
			contador++;
			TablaSuma[contador] = TablaB[i];
			contador++;
		}

	}

}
