package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio13 {

	
	/*
	 * Pide 10 números. Muestra la media de los números positivos, la media de los números negativos, y el número de ceros.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero=0;
		int contadorneg=0;
		int contadorpos=0;
		int contador0=0;
		int pos=0;
		int neg=0;
		
		double mediapos=0;
		double medianeg=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Introduce 10 Números: ");
			numero=sc.nextInt();
			
			
			if (numero<0) {
				contadorneg++;
				neg+=numero;
			}else {
				if(numero>0) {
					pos+=numero;
					contadorpos++;
			
				}else {
					contador0++;
				}
			}
		}
		mediapos = (double) pos/contadorpos;
		medianeg = (double) neg/contadorneg;
		
		System.out.println("La media de los números positivos son: " +mediapos);
		System.out.println("La media de los números negativos son: " +medianeg);
		System.out.println("Contador ceros : " +contador0);
	}
}
