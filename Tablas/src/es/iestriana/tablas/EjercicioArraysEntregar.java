package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArraysEntregar {

//  Complete una tabla de 10 números (valores aleatorios del 1 al 20). Realiza una función que devuelva el número más repetido.
	
	static int[] numAleatorios = new int[10];
	static int[] contadores = new int[10];


	public static void main(String[] args) {
		rellenarArray();
		vecesRepetidas();
		masRepetido();
	}

	private static void masRepetido() {
		int max = 0, posMax = 0;
		for (int i = 0; i < contadores.length; i++) {
			if(contadores[i] > max){
				max = contadores[i];
				posMax = i;
			}
		}
		System.out.println("El más repetido es " + numAleatorios[posMax] + " se repite " + max + " veces");
	}

	private static void vecesRepetidas() {
		for(int i = 1; i < 20; i++){
			int contador = 0;
			for (int j = 0; j < numAleatorios.length; j++) {
				if (i == numAleatorios[j]){
					contador++;
					contadores[j] = contador;
				}
			}
			System.out.println(i + " se repite " + contador + " veces");
		}
	}

	private static void rellenarArray() {
		Random random = new Random();
		for(int i = 0; i < numAleatorios.length; i++){
			numAleatorios[i] = random.nextInt(20)+1;
		}
		System.out.println(Arrays.toString(numAleatorios));
	}
}

