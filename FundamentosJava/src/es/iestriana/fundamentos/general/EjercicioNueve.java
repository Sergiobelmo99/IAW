package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioNueve {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el precio:");
		double precio = sc.nextDouble();
		System.out.println("Introduce la Cantidad: ");
		int cantidad = sc.nextInt();
		
		
		double esta1 = precio * cantidad / 500000;
		double esta2 = precio * cantidad / 458741;
		double esta3 = precio * cantidad / 125874;
				
		System.out.println("Precio medio de establecimiento 1: " + esta1 + "\n" + "Precio medio de establecimiento 2: " + esta2 + "\n"+  "Precio medio de establecimiento 3: " + esta3);
		
		
		sc.close();
		
	

	}

}
