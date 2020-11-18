package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio1condicionales {
	
	// Programa que lea un número entero y muestre si el número es múltiplo de 10.

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int numero;
		
		System.out.println("Introduzca número: ");
		numero =sc.nextInt();
		if (numero%10==0) {
			System.out.println("El número es múltiplo de 10");
		}else
			System.out.println("El número no es múltiplo de 10");
		sc.close();
	}

}
