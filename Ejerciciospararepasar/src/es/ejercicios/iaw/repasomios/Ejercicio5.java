package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio5 {

	// Solicitar números hasta que se escriba 0, mostrar la suma de todos los números ingresados.
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		int suma =0;
		do {
			System.out.println("Introduce Número: ");
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
