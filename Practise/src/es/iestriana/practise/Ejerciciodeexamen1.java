package es.iestriana.practise;

import java.util.Scanner;

public class Ejerciciodeexamen1 {

//	//Programa que solicita un número entero positivo de 2 cifras:
//	- Escriba todos sus divisores (los divisores de un número natural son los números naturales que lo pueden dividir, resultando de cociente otro número natural y de resto 0)
//	- Escriba todos los números pares anteriores al número hasta el 0 y todos los números impares anteriores al número hasta el 0.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Introduce Número de dos cifras: ");
			numero = sc.nextInt();

			if (numero >= 10 && numero <= 99) {
				for (int i = 1; i <=numero; i++) {
					if (numero % i == 0) {
						System.out.println("Los divisores son: " + i);
					}
				}
			} else {
				System.out.println("Introduce un número en el rango de 10 y 99");
			}
			for (int i = 0; i < numero; i++) {
				if (i % 2 == 0) {
					System.out.println("Los números pares son: " + i);
				} else if (i % 2 != 0) {
					System.out.println("Los números impares son :" + i);
				}

			}

		} while (numero >= 10 || numero <= 99);

	}

}
