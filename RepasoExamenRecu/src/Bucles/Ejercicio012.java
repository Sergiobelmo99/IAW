package Bucles;

import java.util.Scanner;

public class Ejercicio012 {

	// Pide un n�mero y calcula su factorial.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
	
		long factorial=1;
		
		System.out.println("Introduce n�mero: ");
		numero= sc.nextInt();
		
		
		for (int i = numero; i >=1; i--) {
			
			System.out.println(i);
			factorial = factorial * i;
			
		}
		System.out.println("El factorial del n�mero : " + numero + " es: " +factorial);
		
	}

}
