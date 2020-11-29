package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio7 {

	//Pida un número N y muestre todos los números del 1 al N.
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el numero cateto: ");
		int numero =sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
