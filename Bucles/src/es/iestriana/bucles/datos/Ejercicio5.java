package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Escriba un programa que lea un n�mero del teclado y realice la suma de los siguientes 100 n�meros, mostrando el resultado en la pantalla.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el n�mero: ");
		int numero =sc.nextInt();
		
		int suma=0;
		
		for (int i= numero + 1; i <= numero +100 ;i++ ) {
			System.out.println(i + "");
			suma = suma + i;
		}
		System.out.println("Suma: " + suma);
		
		
		
		
		
	}

}
