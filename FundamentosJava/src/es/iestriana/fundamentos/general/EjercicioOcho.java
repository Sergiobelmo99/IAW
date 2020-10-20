package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioOcho {
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el Lado: ");
		double lado = sc.nextDouble();
		double perimetro = 3 * lado;
		double area = (lado * 2) / 2;
		System.out.println("Perímetro: " +perimetro);
		System.out.println("Area: " +area);
		sc.close();
	

	}

}
