package Bucles;

import java.util.Scanner;

public class Ejercicio06 {

	// Preguntar por los n�meros hasta que se teclee el 0, mostrar la suma de todos los n�meros introducidos.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero;
		int suma=0;
		do {
			System.out.println("Introduce N�mero: ");
			numero = sc.nextInt();
			
			suma = suma + numero;
			
		} while (numero !=0);
		System.out.println(suma);
		sc.close();
	}

}
