package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioUno {
	/*
	 * Programa que realice la conversión de grados Celsius
	 * a Fahrenheit. Los grados de Celsius los debe introducir 
	 * el usuario
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce los Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
		System.out.println(gradosCelsius + " Grados Celsius son: " + gradosFahrenheit + " Grados Fahrenheit" );

	}

}
