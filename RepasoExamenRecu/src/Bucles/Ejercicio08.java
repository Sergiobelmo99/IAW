package Bucles;

import java.util.Scanner;

public class Ejercicio08 {

	// Pedir un número N, y mostrar todos los números del 1 al N.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		System.out.println("Introduce Número");
		numero = sc.nextInt();
		for (int i = 1; i <=numero; i++) {
			System.out.println(i);
			
		}
	}

}
