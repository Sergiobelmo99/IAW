package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioSiete {
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Cantidad: ");
		double cantidad = sc.nextDouble();
		
		System.out.println("Interés: ");
		double interes = sc.nextDouble();
		
		System.out.println("Plazo: ");
		int plazo = sc.nextInt();
		
		double total = ((((cantidad * interes) /100) - (((cantidad * interes) / 100) * 1.8)) * plazo);
		System.out.println("TOTAL: " + total);
		
		sc.close();
		
	}

}
