package Primeros;

import java.util.Scanner;

public class Ejercicio1 {

	
	// Hacer un programa que convierta de Fahrenheit a Celsius. Los grados Celsius deben ser solicitados al usuario.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double celsius;
		
		System.out.println("Introduce los Grados: ");
		celsius = sc.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Los grados Celsius son : " + celsius +" Y los grados Fahrenheit son: " + fahrenheit);

	}

}
