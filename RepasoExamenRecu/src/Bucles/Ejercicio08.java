package Bucles;

import java.util.Scanner;

public class Ejercicio08 {

	// Pedir un n�mero N, y mostrar todos los n�meros del 1 al N.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		System.out.println("Introduce N�mero");
		numero = sc.nextInt();
		for (int i = 1; i <=numero; i++) {
			System.out.println(i);
			
		}
	}

}
