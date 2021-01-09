package Bucles;

import java.util.Scanner;

public class Ejercicio025 {

	// Dibuja un cuadrado con n elementos laterales usando *.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int lado;
		System.out.println("Indique el tamaño del lado: ");
		lado=sc.nextInt();
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("*  ");
			}
			System.out.println("\n");
		}
	
	}

}

