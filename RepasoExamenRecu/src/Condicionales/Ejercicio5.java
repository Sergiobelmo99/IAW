package Condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	
	// Pida dos n�meros y mu�strelos en orden de mayor a menor
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		System.out.println("Introduce un n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce un n�mero: ");
		numero2 =sc.nextInt();
		
		if (numero1 > numero2 && numero2 < numero1) {
			System.out.println("El primer numero es: " + numero1 + " El segundo n�mero es: " + numero2);
			
		}else if (numero2 > numero1 && numero1 < numero2) {
			System.out.println("El primer numero es: " + numero2 + "El segundo es: " + numero1);
		}
	}

}
