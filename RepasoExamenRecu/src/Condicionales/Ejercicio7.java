package Condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	//Introduzca una calificación de 0 a 10 y muéstrela en la forma: insuficiente, suficiente, bueno...
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num=0;
		
		
		do {
			System.out.println("Introduce calificación: ");
			num = sc.nextInt();
			if (num <=4 && num >=0) {
				System.out.println("Insuficiente");
			}else if (num ==5){
				System.out.println("Suficiente");
			}else if (num ==6) {
				System.out.println("Bien");
			}else if (num >=7 && num <=8 ) {
				System.out.println("Notable");
			}else if (num >=9 && num <=10) {
				System.out.println("Sobresaliente");
		}
			
		} while (num <=10 && num >=0);
		
	

}

}
