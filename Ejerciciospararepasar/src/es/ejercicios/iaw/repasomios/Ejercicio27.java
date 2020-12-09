package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio27 {

	
	/*
	 * Hacer un programa que nos pida un número n, y nos diga cuántos números hay entre 1 y n que sean primos.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
 
		int j;
		int cont_pri=0;
		boolean primo;
		
		System.out.print("Introduce numero: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <num; i++) {
			primo=true;
			j=2;
			
			while (j <=1-1 && primo==true) {
				if(i%j==0) {
					primo=false;
				}
				j++;
		}if (primo) {
			cont_pri++;
			System.out.println(i+ " Es Primo");
			}
		}
		System.out.println("Del 1 a " + num+ "hay"+ cont_pri + "números primos");
	}
}
