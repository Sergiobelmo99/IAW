package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio4 {

	
	// Solicite números hasta que se escriba un negativo y muestre cuántos números se han ingresado.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		int contador = 0;
		do {
			System.out.println("Introduce el número: ");
			num = sc.nextInt();
			contador++;
		} while (num >=0);
		
		if (num < 0) {
			System.out.println("Has introducido " +contador+ " numeros");
		}
		sc.close();
	}

}
