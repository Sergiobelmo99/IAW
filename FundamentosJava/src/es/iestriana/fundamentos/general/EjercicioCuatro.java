package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioCuatro {

	/*
	 * Solicitar al usuario el radio de una circunferencia y calcular su longitud y su área
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el radio: ");
		double radio = sc.nextDouble();
		double longitud = 2 * Math.PI * radio;
		double area =  Math.PI *  Math.pow(radio, 2);
		System.out.println("Área :" + area);
		System.out.println("Longitud :" + longitud);
		
		sc.close();
	}

}
