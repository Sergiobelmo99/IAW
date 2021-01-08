package Bucles;

import java.util.Scanner;

public class Ejercicio10 {

//	// Dados dos números, indique si son amigos o no. Dos números son amigos si la suma de los divisores propios de uno de ellos es igual al otro (la unidad se considera un divisor propio, pero el mismo número no lo es)
//	220 y 284
//	284 = 1 + 2 + 4 + 71 + 142 = 220
//	220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el primer número: ");
		int Numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int Numero2 = sc.nextInt();
		int SumaDivisoresNumero1 = 0, SumaDivisoresNumero2 = 0;

		for (int i = 1; i < Numero1; i++) {
			if (Numero1 % i == 0) {
				SumaDivisoresNumero1 = SumaDivisoresNumero1 + i;
			}
		}
		for (int j = 1; j < Numero2; j++) {
			if (Numero2 % j == 0) {
				SumaDivisoresNumero2 = SumaDivisoresNumero2 + j;
			}
		}
		if (SumaDivisoresNumero1 == Numero2 && SumaDivisoresNumero2 == Numero1) {
			System.out.println("Los numeros " + Numero1 + " y " + Numero2 + " son amigos");
		} else {
			System.out.println("Los numeros " + Numero1 + " y " + Numero2 + " no son amigos");
		}
	}

}
