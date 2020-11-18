package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio3 {

	//Lea los números hasta que ingrese un 0. Para cada uno indique si es par o impar.
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero = 0;
		
		do {
			System.out.println("Introduce el número: ");
			numero = sc.nextInt();
			if (numero == 0) {
				System.out.println("Es 0. Fin del bucle");
			}else {
				if (numero%2 == 0) {
				System.out.println("Número PAR");
				}else {
				System.out.println("Número Impar cateto");
			}
			}
		} while (numero != 0);

		sc.close();
	}

}
