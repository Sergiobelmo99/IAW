package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	
	// Debe solicitar un n�mero positivo. Mostrar todos los n�meros desde el solicitado hasta el 0
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero=0;
		
		do {
			System.out.println("Introduce n�mero: ");
			numero=sc.nextInt();
			for (int i = numero ; i >=0; i--) {
				System.out.println(i);
			}
		} while (numero > 0);
		
		
	}

}
