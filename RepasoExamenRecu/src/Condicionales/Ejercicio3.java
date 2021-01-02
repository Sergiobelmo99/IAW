package Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	
	//Pide dos números y di si uno es un múltiplo del otro
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce un número: ");
		numero2 =sc.nextInt();
		
		if (numero1%numero2==0) {
			System.out.println("Los números son múltiplos");
		}else {
			System.out.println("Los números no son múltiplos");
			
		}
		
		
		
		sc.close();


	}

}
