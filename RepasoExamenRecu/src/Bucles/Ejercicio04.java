package Bucles;

import java.util.Scanner;

public class Ejercicio04 {

	// Pedir n�meros hasta que se introduzca un negativo, y mostrar cu�ntos n�meros se han introducido.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		int contador=0;
		
		do {
			System.out.println("Introduce N�meros: ");
			numero= sc.nextInt();
			contador++;			
			
		} while (numero >=0);
		System.out.println("Se han introducido: " +contador + " numeros");

		sc.close();
	}

}
