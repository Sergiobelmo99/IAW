package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio5 {

	// Solicitar n�meros hasta que se escriba 0, mostrar la suma de todos los n�meros ingresados.
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		int suma =0;
		do {
			System.out.println("Introduce N�mero: ");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("Fin del bucle");
			}else {
				suma = suma + num;
			}
		} while (num !=0);
		
		System.out.println("La suma es: " + suma);
		sc.close();

	}

}
