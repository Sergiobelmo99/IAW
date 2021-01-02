package Condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	// Pide dos números e indica cuál es el mayor o si son iguales

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1;
		int numero2;

		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();

		System.out.println("Introduce un número: ");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("El número mayor es: " + numero1);
		} else if ( numero1 < numero2){
			System.out.println("El número mayor es: " + numero2);
		} else if(numero1 == numero2) {
			System.out.println("Los números son iguales");
		}
	}

}
