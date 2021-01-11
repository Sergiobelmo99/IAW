package Tablas;

import java.util.Scanner;

public class Ejercicio2 {

	
	// Lee n n�meros en orden creciente. 
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad, buscar, posicion=0;
		boolean encontrado=false;
		
		System.out.println("Diga cu�ntos n�meros va a introducir: ");
		cantidad=sc.nextInt();
		
		int[] numeros= new int[cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca n�mero en orden creciente: ");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("Introduzca el n�mero a buscar: ");
		buscar=sc.nextInt();
		do {
			if(buscar==numeros[posicion]) {
				encontrado=true;
			}else {
				posicion++;
			}
		} while (!encontrado && posicion <cantidad);
		
		if(encontrado) {
			System.out.println("El n�mero " + buscar + " est� en la posici�n " + posicion);
		}else {
			System.out.println("El n�mero no est� en la tabla");
		}
	}

}

