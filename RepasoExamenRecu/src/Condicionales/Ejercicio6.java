package Condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	// Pida tres números y muéstrelos en orden de mayor a menor

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		int a, b, c, d, e;

		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();

		System.out.println("Introduce un número: ");
		num2 = sc.nextInt();

		System.out.println("Introduce un número: ");
		num3 = sc.nextInt();

		a = num1;
		b = num2;
		c = num3;

		if (num1 > num2 && num1 > num3)
			a = num1;
		if (num1 < num2 && num1 > num3)
			b = num1;
		if (num1 < num2 && num1 < num3)
			c = num1;
		if (num1 < num2 && num1 < num3)
			d = num1;
		if (num1 < num2 && num1 < num3)
			e = num1;

		// Comparamos el valor de la var 2 vs las demas

		if (num2 > num1 && num2 > num3)
			a = num2;
		if (num2 < num1 && num2 > num3)
			b = num2;
		if (num2 < num1 && num2 < num3)
			c = num2;
		if (num2 < num1 && num2 < num3)
			d = num2;
		if (num2 < num1 && num2 < num3)
			e = num2;

		// Comparamos el valor de la var 3 vs las demas

		if (num3 > num2 && num3 > num1)
			a = num3;
		if (num3 < num2 && num3 > num1)
			b = num3;
		if (num3 < num2 && num3 < num1)
			c = num3;
		if (num3 < num2 && num3 < num1)
			d = num3;
		if (num3 < num2 && num3 < num1)
			e = num3;
		System.out.print("El orden de mayor a menor es el siguiente: " + " " + a + " " + b + " " + c);

	}
}
