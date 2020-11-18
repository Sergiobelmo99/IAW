package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio1 {

	// Leer un número y mostrar su cuadrado. Repetir el proceso hasta ingresar un número negativo
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero = 0;
		int cuadrado = 0;
		do {
			System.out.println("Introduce Número: ");
			numero =sc.nextInt();
			if (numero >=0) {
				cuadrado = numero * numero;
				System.out.println("El cuadrado del número es: " + cuadrado);
			}else { 
				System.out.println("Introduce Número válido");}
		} while (numero >=0);
			
		sc.close();	
	}

}
