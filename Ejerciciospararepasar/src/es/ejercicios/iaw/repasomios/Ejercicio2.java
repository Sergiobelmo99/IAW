package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio2 {

	// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se ingrese un 0.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
				
		do {
			System.out.println("Introduce Número: ");
			numero =sc.nextInt();
			
			if (numero == 0) {
				System.out.println("Fin del mundo");}
			else {
					
			if (numero > 0) {
				System.out.println("El numero introducido es Positivo");}
				
			else  {
				System.out.println("El número introducido es Negativo");}
			}
		} while (numero != 0);
		System.out.println("El número es un 0");
		sc.close();
	}

}
