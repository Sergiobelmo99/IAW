package Bucles;

import java.util.Scanner;

public class Ejercicio5 {

	
	// Escribir un programa que lea un n�mero del teclado y realice la suma de los siguientes 100 n�meros, mostrando el resultado en la pantalla
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero=0;
		int suma=0;
		
		System.out.println("Introduce n�mero: ");
		numero=sc.nextInt();
		
		for (int i = numero+1 ; i <= numero +100; i++) {
			System.out.println(i + "");
			suma = suma+i;
		}
		System.out.println("La suma es : "+ suma);

	}

}
