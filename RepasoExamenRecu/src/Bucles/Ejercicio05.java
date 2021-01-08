package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	
	// Juegue un juego para adivinar un n�mero. Para ello, pida un n�mero N, y luego vaya pidiendo n�meros indicando "m�s alto" o "m�s bajo" dependiendo de si es m�s alto o m�s bajo con respecto a N. El proceso termina cuando el usuario acierta.
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// El sistema guarda un n�mero
		int random = new Random() .nextInt(50)+1;
		
		// n� de intentos
		int intentos = 5;
		
		//variable para cuando encuentre el numero
		boolean encontrada = false;
		
		do {
			System.out.println("N�mero: ");
			int numero = sc.nextInt();
			
			if (numero > random){
				System.out.println("N�mero buscado m�s peque�o");
			}else if (numero < random) {
				System.out.println("N�mero buscado m�s grande");

			}else {
				encontrada = true;
			}
			intentos --;
		} while (intentos > 0 && !encontrada);
		
		if (encontrada) {
			System.out.println("Has encontrado el n�mero " +  random + " en " + (5-intentos) + " intentos");
		}else {
			System.out.println("No has encontrado el n�mero " + random);
		}
		
		
		sc.close();

	}

}