package es.iestriana.bucles.datos;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 * Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, pregúntele al usuario qué tabla quiere mostrar.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

for (int tabla = 1; tabla <= 10; tabla++) {
			
			System.out.println("Tabla del " + tabla);
			
			for (int numero = 1; numero <= 10; numero++) {
				
				System.out.println(tabla + " * " + numero 
						+ " = " + (tabla*numero));
			}
		}
		
		int numeroTabla = 0;
		do {
			System.out.println("TABLA: ");
			numeroTabla = sc.nextInt();
		} while (numeroTabla <= 0);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numeroTabla + " * " + i 
					+ " = " + (numeroTabla*i));
			
		}

		sc.close();
		
		
		
		
	}

}
