package Condicionales;

import java.util.Scanner;

public class Ejercicio12 {

	
	// Solicite dos fechas y muestre el número de días que son diferentes. Asumiendo todos los meses de 30 días.
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("DÍA 1: ");
		int dia1 = sc.nextInt();
		System.out.println("MES 1: ");
		int mes1 = sc.nextInt();
		System.out.println("AÑO 1: ");
		int anyo1 = sc.nextInt();
		
		System.out.println("DÍA 2: ");
		int dia2 = sc.nextInt();
		System.out.println("MES 2: ");
		int mes2 = sc.nextInt();
		System.out.println("AÑO 2: ");
		int anyo2 = sc.nextInt();
		
		//Assuming all 30-day months
		
		int diasDiferencia = dia2 - dia1 + 
				(mes2 - mes1) * 30 + 
				(anyo2 - anyo1) * 365;
		
		System.out.println("DÍAS: " + diasDiferencia);
		
		sc.close();
	}

}