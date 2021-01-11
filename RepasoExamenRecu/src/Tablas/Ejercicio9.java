package Tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	// Crear una tabla de n elementos. Mostrar la tabla ordenada
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cantidad;
		
		
		System.out.println("Introduce cantidad de numeros: ");
		cantidad = sc.nextInt();
		int[]numeros = new int[cantidad];
		
		RellenarTabla(numeros);
		Arrays.sort(numeros);
	}
	private static void RellenarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(50);
			System.out.print(numeros[i]+ " ");
		}
		Arrays.sort(numeros);
		System.out.println("\n" + "Tabla ordenada " + Arrays.toString(numeros));
	}

}
