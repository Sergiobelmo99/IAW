package Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	
	// Pida un n�mero e indique si es positivo o negativo
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();
		 
		if (numero<0) {
			System.out.println("El n�mero es Negativo.");
			
		}else {
			System.out.println("El n�mero es Positivo.");
		}

	}

}
