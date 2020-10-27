package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + "Es igual a " + num2);
		} else {
			System.out.println(num1 + " Es distinto a " + num2);
		}
		
				
		if (num1 > 0) {
			System.out.println(num1 + "Es positivo");
		}else if (num1 < 0) {
			System.out.println(num1 + "Es negativo");
		}else {
			System.out.println(num1 + "es cero");
		}
		
		//if (num1 % num2 == 0)
		
			System.out.println("Nº 3:");
			int num3 = sc.nextInt();
			
			if (num1 > num2 && num1 > num3) {
				if (num2 > num3) {
					System.out.println(num1 + ", "+ num2 + ", " + num3);
				}else {
					System.out.println(num1 + ", "+ num3 + ", " + num2);
				}
			}else if (num2 > num1 && num2 > num3) {
				if (num1 > num3) {
					System.out.println(num2 + ", "+ num1 + ", " + num3);
				}else {
					System.out.println(num2 + ", "+ num3 + ", " + num3);
				}
				}else {
					if (num1 > num2) {
						System.out.println(num3 + ", "+ num1 + ", " + num2);
					}else {
						System.out.println(num3 + ", "+ num2 + ", " + num1);
					}
				}
			
		
		sc.close();		
	}
	


}
