package Bucles;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	// P�dale al usuario n n�meros y mu�streles ordenados.

	private static Scanner sc = new Scanner(System.in);
	private static int []numeros= new int[10];
	public static void main(String[] args) {
		for (int i = 0; i <numeros.length; i++) {
			System.out.println("Introduzca n�mero: " + i);
			numeros[i]=sc.nextInt();
		}
		System.out.println("La tabla antes de ordenar es:");
		ImprimeTabla(numeros);
		System.out.println("La tabla despu�s de ordenar");
		OrdenaNumeros(numeros);
		ImprimeTabla(numeros);
	}
	private static void ImprimeTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}
	private static void OrdenaNumeros(int[] numeros) {
		int aux;
		for (int i = 0; i < numeros.length-1; i++) {
			for (int j = 0; j < numeros.length-1; j++) {
				if(numeros[j]>numeros[j+1]) {
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
				}
			}
		}
		
	}

}