package Condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	
	// Pide dos n�meros y di si son los mismos o no.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce n�mero: ");
		numero1= sc.nextInt();
		System.out.println("Introduce n�mero: ");
		numero2=sc.nextInt();
		if ( numero1 == numero2){
			System.out.println("Los n�meros introducidos son iguales.");
			
		}else {
			System.out.println("Los n�meros introducidos no son iguales.");
		}

	}

}
