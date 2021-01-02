package Condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	
	// Pida dos números y muéstrelos en orden de mayor a menor
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce un número: ");
		numero2 =sc.nextInt();
		
		if (numero1 > numero2 && numero2 < numero1) {
			System.out.println("El primer numero es: " + numero1 + " El segundo número es: " + numero2);
			
		}else if (numero2 > numero1 && numero1 < numero2) {
			System.out.println("El primer numero es: " + numero2 + "El segundo es: " + numero1);
		}
	}

}
