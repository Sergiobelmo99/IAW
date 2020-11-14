package es.iestriana.bucles.datos;

import java.util.Scanner;

public class EjercicioJavaEntregar {

	/*
	 * Introduce 2 n�meros de tal manera que el segundo sea mayor que el primero. 
	 * Desde el primero, imprima los n�meros separados entre s� 7 unidades hasta el segundo. 
	 * Cuente cu�ntos n�meros se han impreso. 
	 * De todos estos n�meros que se han impreso queremos saber cu�ntos son pares y cu�nto es la suma de los impares.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroG;
		int numeroP = 0;
		do {
			System.out.println("Introduce N�mero Peque�o: ");
			numeroG = sc.nextInt();
			System.out.println("Introduce N�mero Grande: ");
			numeroP = sc.nextInt();
			if(numeroG >= numeroP) {
			System.out.println("N�mero demasiado Peque�o. Pruebe otro m�s grande");
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
			System.out.println("Total N�meros impresos: " + contador + "\n" + "Total N�meros de pares: " + contadorPar + "\n" + "La suma de los impares son: " + impar);
			sc.close();
	}
	
}
