package Bucles;

import java.util.Scanner;

public class Ejercicio015 {

	
	// Dadas las edades y alturas de 5 estudiantes, muestre la edad y altura promedio, el número de estudiantes mayores de 18 años y el número de estudiantes que miden más de 1,75.
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int edad;
		int altura;
		int contadore=0;
		int contadora=0;
		int promedio=0;
		int contadoralt=0;
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Introduce las edades: ");
			edad = sc.nextInt();
			System.out.println("Introduce la altura en cm: ");
			altura = sc.nextInt();
			contadoralt++;
			
			promedio = promedio + altura / contadoralt;
			
			if (edad > 18) {
				contadore++;
			}if (altura > 175) {
				contadora++;
			}
			
		}
		System.out.println("La altura promedio es : " + promedio);
		System.out.println("Mayores 18 hay: " + contadore);
		System.out.println("Mayor altura de 175 hay: " +contadora);
	}

}
