package Bucles;

import java.util.Scanner;

public class Ejercicio010 {

	// Pide 15 n�meros y escribe la suma total.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		int suma=0;
		
		for (int i = 1; i <=15; i++) {
			System.out.println("Introduce 15 N�meros: ");
			numero=sc.nextInt();
			
			suma= suma + numero;
			
			
		}
		System.out.println(suma);
	}

}
