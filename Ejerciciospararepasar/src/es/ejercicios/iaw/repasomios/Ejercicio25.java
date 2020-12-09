package es.ejercicios.iaw.repasomios;

import java.util.Scanner;

public class Ejercicio25 {

	
	/*
	 * Dibuja un cuadrado con n elementos laterales usando *.
	 */
	
	
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Por favor ingrese el tamaño del cuadrado: ");
        int n = sc.nextInt();
       
        if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 50");
        }
               
 
    }
}