package Condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	
	// Pide dos números y di si son los mismos o no.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce número: ");
		numero1= sc.nextInt();
		System.out.println("Introduce número: ");
		numero2=sc.nextInt();
		if ( numero1 == numero2){
			System.out.println("Los números introducidos son iguales.");
			
		}else {
			System.out.println("Los números introducidos no son iguales.");
		}

	}

}
