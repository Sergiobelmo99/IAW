package es.iestriana.practise;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPedircantidadusuarioyrellenarusuariotabla {

	// Pedir a usuario cantidad y rellenar la tabla el usuario

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad, numeros;
		System.out.println("Indique el tamaño de la tabla:");
		cantidad = sc.nextInt();
		int[] tabla = new int[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce valor para la tabla:");
			numeros = sc.nextInt();
			tabla[i] = numeros;
		}

		System.out.println("Valores introducidos: " + Arrays.toString(tabla));
	}

}
