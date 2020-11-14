package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioJavaEntregar {

	/*
	 * Introduce 2 números de tal manera que el segundo sea mayor que el primero. 
	 * Desde el primero, imprima los números separados entre sí 7 unidades hasta el segundo. 
	 * Cuente cuántos números se han impreso. 
	 * De todos estos números que se han impreso queremos saber cuántos son pares y cuánto es la suma de los impares.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroG;
		int numeroP = 0;
		do {
			System.out.println("Introduce Número Pequeño: ");
			numeroG = sc.nextInt();
			System.out.println("Introduce Número Grande: ");
			numeroP = sc.nextInt();
			if(numeroG >= numeroP) {
			System.out.println("Número demasiado Pequeño. Pruebe otro más grande");
			}
		} while (numeroG >= numeroP);
		
			
			int contador = 0;
			int contadorPar = 0;
			int impar = 0;
			for(int i = numeroG; i <=numeroP; i+=7) {
				contador++;
				System.out.println(i);
			
				if (i%2==0) {
					contadorPar++;
				}else {
				   impar = impar + i;
				}
			}
			System.out.println("Total Números impresos: " + contador + "\n" + "Total Números de pares: " + contadorPar + "\n" + "La suma de los impares son: " + impar);
			sc.close();
	}
	
}
