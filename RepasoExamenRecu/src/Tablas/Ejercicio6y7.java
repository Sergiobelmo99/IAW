package Tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6y7 {

	// Crear una tabla de n elementos. Pidiendo al usuario un valor entre 0 y n-1. Eliminar el valor de esa posición y mover todos los elementos para no dejar el hueco vacío
	
	private static int [] tabla  =new int[10];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int posicion;
		RellenarTabla(tabla);
		do {
			System.out.println("Introduzca un número entre 0 y 9: ");
			posicion=sc.nextInt();
			if(posicion<0 || posicion>9 ) {
				System.out.println("El número introducido no es correcto");
			}				
		} while (posicion<0 || posicion>9);
		
		System.out.print(Arrays.toString(tabla));
		CambiarPosicion(tabla,posicion);
		System.out.println();
		for (int i = 0; i < tabla.length-1; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
		private static void CambiarPosicion(int[] tabla, int posicion) {
		
			for (int i = posicion; i < tabla.length-1; i++) {
				tabla[i]=tabla[i+1];		
			}			
			tabla[tabla.length-1]=0;
	}


	private static void RellenarTabla(int[] tabla) {
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i]= new Random().nextInt(50);
		}
	}

	
	
}