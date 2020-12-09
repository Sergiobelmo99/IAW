package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio24 {

	/*
	 * Diseñe una aplicación que muestre las tablas de multiplicación del 1 al 10.
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

