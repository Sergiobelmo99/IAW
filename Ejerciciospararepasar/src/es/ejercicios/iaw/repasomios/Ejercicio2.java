package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio2 {

	// Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta que se ingrese un 0.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
				
		do {
			System.out.println("Introduce N�mero: ");
			numero =sc.nextInt();
			
			if (numero == 0) {
				System.out.println("Fin del mundo");}
			else {
					
			if (numero > 0) {
				System.out.println("El numero introducido es Positivo");}
				
			else  {
				System.out.println("El n�mero introducido es Negativo");}
			}
		} while (numero != 0);
		System.out.println("El n�mero es un 0");
		sc.close();
	}

}
