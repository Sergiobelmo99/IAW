package Bucles;

import java.util.Scanner;

public class Ejercicio6 {

	
	
	// Pide un número y calcula su factorial
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		long factorial=1;
		
		System.out.println("Introduce número: ");
		numero=sc.nextInt();
		
		for (int i = numero; i >=1 ; i--) {
			
			factorial = factorial * i;
			
		}
		
		System.out.println("El factorial de "+ numero + " es :" + factorial);
		
		sc.close();

	}

}
