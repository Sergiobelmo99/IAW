package Condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	// Pide dos n�meros e indica cu�l es el mayor o si son iguales

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1;
		int numero2;

		System.out.println("Introduce un n�mero: ");
		numero1 = sc.nextInt();

		System.out.println("Introduce un n�mero: ");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("El n�mero mayor es: " + numero1);
		} else if ( numero1 < numero2){
			System.out.println("El n�mero mayor es: " + numero2);
		} else if(numero1 == numero2) {
			System.out.println("Los n�meros son iguales");
		}
	}

}
