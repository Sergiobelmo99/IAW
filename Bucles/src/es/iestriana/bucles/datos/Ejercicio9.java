package es.iestriana.bucles.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * Pídale al usuario n números y muéstreles ordenados.
	 */
	

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cantidad = 0;
		int rango = 0;
		// indico cantidad
		do {
			System.out.println("INTRODUCE CANTIDAD: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		int[] numeros = new int[cantidad];
		// indico rango
		do {
			System.out.println("INDICA RANGO:");
			rango = sc.nextInt();
		} while (rango <= 0);
		// relleno la tabla
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(rango + 1);
		}
		// mustro la tabla rellenada
		System.out.println("TABLA RELLENADA: ");
		for (int i = 0; i < cantidad; i++) {
			System.out.print(numeros[i] + ",");
		}
	}
		
	}

