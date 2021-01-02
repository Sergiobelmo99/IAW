package Condicionales;

import java.util.Scanner;

public class Ejercicio12 {

	
	// Solicite dos fechas y muestre el n�mero de d�as que son diferentes. Asumiendo todos los meses de 30 d�as.
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("D�A 1: ");
		int dia1 = sc.nextInt();
		System.out.println("MES 1: ");
		int mes1 = sc.nextInt();
		System.out.println("A�O 1: ");
		int anyo1 = sc.nextInt();
		
		System.out.println("D�A 2: ");
		int dia2 = sc.nextInt();
		System.out.println("MES 2: ");
		int mes2 = sc.nextInt();
		System.out.println("A�O 2: ");
		int anyo2 = sc.nextInt();
		
		//Assuming all 30-day months
		
		int diasDiferencia = dia2 - dia1 + 
				(mes2 - mes1) * 30 + 
				(anyo2 - anyo1) * 365;
		
		System.out.println("D�AS: " + diasDiferencia);
		
		sc.close();
	}

}