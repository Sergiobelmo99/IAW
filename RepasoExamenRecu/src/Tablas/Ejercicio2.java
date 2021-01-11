package Tablas;

import java.util.Scanner;

public class Ejercicio2 {

	
	// Lee n números en orden creciente. 
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad, buscar, posicion=0;
		boolean encontrado=false;
		
		System.out.println("Diga cuántos números va a introducir: ");
		cantidad=sc.nextInt();
		
		int[] numeros= new int[cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca número en orden creciente: ");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("Introduzca el número a buscar: ");
		buscar=sc.nextInt();
		do {
			if(buscar==numeros[posicion]) {
				encontrado=true;
			}else {
				posicion++;
			}
		} while (!encontrado && posicion <cantidad);
		
		if(encontrado) {
			System.out.println("El número " + buscar + " está en la posición " + posicion);
		}else {
			System.out.println("El número no está en la tabla");
		}
	}

}

