package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	
	// Debe solicitar un número positivo. Mostrar todos los números desde el solicitado hasta el 0
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero=0;
		
		do {
			System.out.println("Introduce número: ");
			numero=sc.nextInt();
			for (int i = numero ; i >=0; i--) {
				System.out.println(i);
			}
		} while (numero > 0);
		
		
	}

}
