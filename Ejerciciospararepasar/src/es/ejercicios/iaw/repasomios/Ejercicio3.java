package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio3 {

	//Lea los n�meros hasta que ingrese un 0. Para cada uno indique si es par o impar.
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero = 0;
		
		do {
			System.out.println("Introduce el n�mero: ");
			numero = sc.nextInt();
			if (numero == 0) {
				System.out.println("Es 0. Fin del bucle");
			}else {
				if (numero%2 == 0) {
				System.out.println("N�mero PAR");
				}else {
				System.out.println("N�mero Impar cateto");
			}
			}
		} while (numero != 0);

		sc.close();
	}

}
