package Bucles;

import java.util.Scanner;

public class Ejercicio021 {

	
	//  Pida 10 n�meros, y muestre al final si se ha introducido alg�n negativo.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		int contador=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Introduce 10 N�meros: ");
			numero = sc.nextInt();
			if (numero < 0) {
				contador++;
			}
			
		}
		System.out.println("Se ha introducido " + contador + " numeros negativos");
		sc.close();

	}

}
