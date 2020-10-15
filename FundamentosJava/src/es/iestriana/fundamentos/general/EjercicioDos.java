package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioDos {
	
	/*
	 * Programa que defina 2 variables enteras 
	 * con la base y altura de un rectángulo.
	 * Calcula su perímetro y área
	 */

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce la base del rectángulo: ");
		int baser = sc.nextInt();
		System.out.println("Introduce la altura: ");
		int altura = sc.nextInt();
		
		int perimetro = 2 * (baser + altura);
		int area = baser * altura;
		System.out.println("El perímetro es:  "  + perimetro + " " + "El área es: " + area);
		
	}

}
