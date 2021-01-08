package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	// Leer por teclado una serie de n números. La aplicación debe decirnos si los números están ordenados en aumento, disminución o si no están ordenados
	
	

		private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			int cantidad;
			do {
				System.out.println("Introduce el número de elementos: ");
				cantidad = sc.nextInt();
			} while (cantidad <=0);
			
			
			// orden --> 1: creciente, -1: decreciente, 0: desordenados
			int orden = comprobarOrden (cantidad);
			
			if (orden == 1) {
				System.out.println("Creciente");
			}else if (orden == -1) {
				System.out.println("Decreciente");
			}else {
				System.out.println("Desordenados");
			}
			
			
			sc.close();

		}
		private static int comprobarOrden(int cantidad) {
			boolean creciente = false, decreciente = false;
			int numero = 0, anterior =0;
			
			for (int i = 0; i < cantidad; i++) {
				System.out.println("Número: ");
				numero = new Random() .nextInt(101);
				System.out.println(numero);
				
				if (i ==0) {
					anterior = numero;
				}else { 
					if (numero > anterior) {
						creciente = true;
					}else if (numero < anterior){
						decreciente = true;
					}
					anterior = numero;
				}
			}
			if (creciente == true && decreciente == false) {
				return 1;
			} else if (creciente == false && decreciente == true) {
				return -1;
			} else {
				return 0;
			}
		}

	}

