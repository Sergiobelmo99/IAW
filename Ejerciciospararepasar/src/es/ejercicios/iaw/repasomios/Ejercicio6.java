package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio6 {

	
	//Pida números hasta que ingrese un negativo y calcule la media.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		int suma=0;
		float contador=0;
		do {
			System.out.println("Introduce numeros: ");
			num=sc.nextInt();
			
			
			
			if (num > 0) {
				suma = suma + num;
				contador++;
				
			}else {
				
			}
			
		} while (num >=0);
		
		sc.close();
		System.out.println("La media es: " + (suma/contador));

	}

}
