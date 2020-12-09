package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio14 {

	
	/*
	 * Pide 10 sueldos. Muestre su suma y cuántos hay de más de 1000 euros.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int sueldo;
		int suma=0;
		int contador=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Introduce 10 sueldos: ");
			sueldo =sc.nextInt();
			if (sueldo < 1000) {
				suma = sueldo+suma;
			}else
				contador++;	
		}
		System.out.println("La suma de los sueldos es: " +suma);
		System.out.println("Sueldo con más ed 1000 euros :" +contador);
	}
}
