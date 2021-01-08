package Bucles;

import java.util.Scanner;

public class Ejercicio014 {


		// Pide 10 sueldos. Muestre su suma y cuántos hay de más de 1000 euros.
		private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			
			double sueldo;
			int contador=0;
			double suma=0;
			
			
			
			for (int i = 1; i <=10; i++) {
				System.out.println("Introduce 10 sueldos: ");
				sueldo= sc.nextDouble();
				
				suma = suma + sueldo;
				
				
				if (sueldo > 1000) {
					contador++;
					
				}
				
				
			}
			System.out.println("Hay " +contador + " sueldos de más de 1000 euros");
			System.out.println("La suma total de los sueldos es: " +suma);
		}

	}