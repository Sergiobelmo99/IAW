package Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	
	//Pide dos n�meros y di si uno es un m�ltiplo del otro
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		System.out.println("Introduce un n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce un n�mero: ");
		numero2 =sc.nextInt();
		
		if (numero1%numero2==0) {
			System.out.println("Los n�meros son m�ltiplos");
		}else {
			System.out.println("Los n�meros no son m�ltiplos");
			
		}
		
		
		
		sc.close();


	}

}
