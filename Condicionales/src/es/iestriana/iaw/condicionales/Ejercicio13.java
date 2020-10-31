package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Ejercicio13 {

	/*Build a program that calculates the body mass index of a person (IMC = weight [kg] / height2 [m]) and indicates the state in which that person is based on the value of IMC:
	IMC value Diagnosis <16 Hospital admission criteria
	from 16 to 17 underweight
	17 to 18 underweight
	18 to 25 normal weight (healthy)
	25 to 30 overweight (grade I obesity)
	30 to 35 chronically overweight (obesity grade II)
	35 to 40 premorbid obesity (grade III obesity)
	> 40 morbid obesity (grade IV obesity)
	Note 1: The use of nested if – else statements is recommended.
	Note 2: The operands (weight and height) must be entered by keyboard by the user.
	*/
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Introduce peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Introduce altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 16) {
			System.out.println("Ingreso Urgente en Hospital");
		} else if (imc >= 16 && imc < 18) {
			System.out.println("Peso Bajo");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("SobrePeso Grado I");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("SobrePeso Grado II");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("SobrePeso Grado III");
		} else {
			System.out.println("SobrePeso Grado IV");
		}
			
		
		
		sc.close();
	}

}