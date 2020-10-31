package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class EjerciciosCondicionales {
	
	/*You are asked to read a positive whole number and determine if it is a 1,2,3 or 4-digit number.
	 * 
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce número:");
		int numero = sc.nextInt();
		
		if (numero >=0) {
			if (numero >=0 && numero <=9) {
				System.out.println("Número de 1 cifra");
			}else if (numero >=10 && numero <=99) {
				System.out.println("Número de 2 cifras");
			}else if (numero >=100 && numero <=999) {
				System.out.println("Número de 3 cifras");
			}else if (numero >=1000 && numero <=9999) {
				System.out.println("Número de 4 cifras");
			}else {
				System.out.println("Número introducido inválido, Intételo de nuevo.");
			}
		}
		sc.close();

	}

}

