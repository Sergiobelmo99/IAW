package es.iestriana.practise;

import java.util.Scanner;

public class EjercicioDivisores {

//	// Dados dos números, indique si son amigos o no. Dos números son amigos si la suma de los divisores propios de uno de ellos es igual al otro (la unidad se considera un divisor propio, pero el mismo número no lo es)
//	220 y 284
//	284 = 1 + 2 + 4 + 71 + 142 = 220
//	220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		int suma1 = 0;
		int suma2 = 0;
		int sumatotal = 0;

		for (int i = 1; i < numero1; i++) {
			if (numero1 % i == 0) {
				System.out.println("Los divisores de 1 son: " + i);
				suma1 = suma1 + i;
			}
		}

		for (int i = 1; i < numero2; i++) {
			if (numero2 % i == 0) {
				System.out.println("Los divisores de 2 son: " + i);
				suma2 = suma2 + i;
			}
		}
		sumatotal = suma1 + suma2;
		System.out.println("La suma total es: " + sumatotal);
		if (suma1 == numero2 && suma2 == numero1) {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " son amigos");
		} else {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " no son amigos");
		}

		sc.close();
	}

}
