package Bucles;

import java.util.Scanner;

public class Ejercicio11 {

	
	// Solicite un n�mero y muestre el cuadrado del n�mero. El cuadrado de un n�mero se obtiene sumando tantos n�meros impares como el n�mero indique. El cuadrado de 1 es 1. El cuadrado de 2 es 4, es decir, 1 + 3. El cuadrado de 3 es 9, es decir, 1 + 3 + 5.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Introduce n�mero: ");
		int numero = sc.nextInt();
		int cuadrado = 0, impar = 1;
		for (int i = 1; i <= numero; i++) {
			cuadrado = cuadrado + impar;
			impar+=2;
		}
		System.out.println("El cuadrado de " + numero + " es " + cuadrado);
		sc.close();
	}

}