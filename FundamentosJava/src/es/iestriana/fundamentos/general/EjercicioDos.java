package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioDos {
	
	/*
	 * Programa que defina 2 variables enteras 
	 * con la base y altura de un rect�ngulo.
	 * Calcula su per�metro y �rea
	 */

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce la base del rect�ngulo: ");
		int baser = sc.nextInt();
		System.out.println("Introduce la altura: ");
		int altura = sc.nextInt();
		
		int perimetro = 2 * (baser + altura);
		int area = baser * altura;
		System.out.println("El per�metro es:  "  + perimetro + " " + "El �rea es: " + area);
		
	}

}
