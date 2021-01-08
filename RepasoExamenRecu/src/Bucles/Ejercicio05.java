package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	
	// Juegue un juego para adivinar un número. Para ello, pida un número N, y luego vaya pidiendo números indicando "más alto" o "más bajo" dependiendo de si es más alto o más bajo con respecto a N. El proceso termina cuando el usuario acierta.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// El sistema guarda un número
		int random = new Random() .nextInt(50)+1;
		
		// nº de intentos
		int intentos = 5;
		
		//variable para cuando encuentre el numero
		boolean encontrada = false;
		
		do {
			System.out.println("Número: ");
			int numero = sc.nextInt();
			
			if (numero > random){
				System.out.println("Número buscado más pequeño");
			}else if (numero < random) {
				System.out.println("Número buscado más grande");

			}else {
				encontrada = true;
			}
			intentos --;
		} while (intentos > 0 && !encontrada);
		
		if (encontrada) {
			System.out.println("Has encontrado el número " +  random + " en " + (5-intentos) + " intentos");
		}else {
			System.out.println("No has encontrado el número " + random);
		}
		
		
		sc.close();

	}

}