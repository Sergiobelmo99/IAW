package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio1condicionales {
	
	// Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int numero;
		
		System.out.println("Introduzca n�mero: ");
		numero =sc.nextInt();
		if (numero%10==0) {
			System.out.println("El n�mero es m�ltiplo de 10");
		}else
			System.out.println("El n�mero no es m�ltiplo de 10");
		sc.close();
	}

}
