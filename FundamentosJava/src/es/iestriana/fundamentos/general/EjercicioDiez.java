package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioDiez {
	
	
	private static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
	
		System.out.println("Introduce radio: ");
		double radio = sc.nextDouble();
		
		double volumen = (4  * Math.PI * Math.pow(radio, 3) / 3);
		
		System.out.println("El volumen de la esfera es: " + volumen );
		sc.close();
	}

}
