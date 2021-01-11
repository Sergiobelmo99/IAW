package Tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio12 {

	// Tabla de n elementos. Escriba un programa que calcule cuántos números
	// diferentes hay en la tabla

	private static int[] numeros = new int[10];

	public static void main(String[] args) {
		RellenaTabla();
		CalculaDiferentes();
	}

	private static void CalculaDiferentes() {
		int cantidad = 1;
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] != numeros[i - 1]) {
				cantidad++;
			}

		}
		System.out.println("La cantidad de números diferenetes es: " + cantidad);
	}

	private static void RellenaTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(20);
		}
	}

}
