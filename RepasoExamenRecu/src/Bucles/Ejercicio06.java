package Bucles;

import java.util.Scanner;

public class Ejercicio06 {

	// Preguntar por los números hasta que se teclee el 0, mostrar la suma de todos los números introducidos.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int numero;
		int suma=0;
		do {
			System.out.println("Introduce Número: ");
			numero = sc.nextInt();
			
			suma = suma + numero;
			
		} while (numero !=0);
		System.out.println(suma);
		sc.close();
	}

}
