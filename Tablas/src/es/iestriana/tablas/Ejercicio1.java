package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Rellena una tabla de 20 n�meros positivos de 
	 * manera aleatoria. Pida un n�mero al usuario e indique
	 * en que posiciones de la tabla se encuentra. Indique tambi�n
	 * si el n�mero no se encuentra en la tabla
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros = new int[20];
	
	public static void main(String[] args) {
		rellenarTabla();
		
		System.out.println(Arrays.toString(numeros));
		
		int valor;
		do {
			System.out.println("N�: ");
			valor = sc.nextInt();
		} while (valor < 0 || valor > 99);
		
		mostrarPosiciones(valor);
		
		sc.close();
	}

	private static void mostrarPosiciones(int valor) {
		boolean encontrado = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				System.out.println(i);
				encontrado = true;
			}
		}		
		if (!encontrado) {
			System.out.println("N�mero no encontrado");
		}
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(100);
		}
	}

}