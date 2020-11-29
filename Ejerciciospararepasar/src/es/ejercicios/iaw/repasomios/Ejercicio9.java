package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio9 {

	//Pide 15 números y escribe la suma total.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numeros;
		int suma = 0;
		
		for (int i = 1; i <= 15; i++) {
			
			System.out.println("Introduce números: ");
			numeros = sc.nextInt();
			
			suma = suma + numeros;
		}
		
		System.out.println("La suma de los numeros es: " + suma);
		sc.close();
	}

}
