package es.iestriana.bucles.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * P�dale al usuario n n�meros y mu�streles ordenados.
	 */
	

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
			
			System.out.println("Introduce N�meros: ");
			numero= sc.nextInt();
			int [] tabla = new int[numero];
			Arrays.sort(tabla);
			System.out.println(Arrays.toString(tabla));
		}
		
		
	}

