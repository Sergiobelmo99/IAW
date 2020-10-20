package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class Ejercicio11 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce número 1: ");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce numero 2: ");
		
		int numero2 = sc.nextInt();
		
		int suma= numero1 + numero2;
		int resta= numero1 - numero2;
		int multi= numero1 * numero2;
		int divi= numero1 / numero2;
		int resto= numero1 % numero2;
		
		System.out.println("La suma es: " + suma + "\n" + "La resta es: " + resta + "\n" + "La multiplicación es :" + multi + "\n" + "La división es: " + divi + "\n" + "El resto es: " + resto);
		sc.close();
	}

}
