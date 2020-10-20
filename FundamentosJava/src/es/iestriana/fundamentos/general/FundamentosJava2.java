package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class FundamentosJava2 {
	
	/*
	 * The user must enter the price of a product (it can be with decimals). 
	 * The price of the product must be shown applying a previously stored VAT with a value of 21%, 18% and 9%.
	 */
	private static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
	
		System.out.println(" Introduce Cantidad: ");
		
		double cantidad = sc.nextDouble();
		
		double iva21 = (cantidad / 100 * 21) + cantidad;
		double iva18 = (cantidad / 100 * 18) + cantidad;
		double iva9	= (cantidad / 100 * 9) + cantidad;
		
		
		System.out.println("El  precio con 21% de IVA es: " + iva21 + "\n" + "El precio con 18% de IVA es: " + iva18 + "\n" + "El precio con 9% de IVA es: " + iva9);
		sc.close();
	}

}

