package Condicionales;

import java.util.Scanner;

public class Ejercicio13 {

	
//	Construya un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en base al valor del IMC:
//		Valor del IMC Diagnóstico <16 Criterios de admisión en el hospital
//		de 16 a 17 de peso inferior al normal
//		17 a 18 bajo peso
//		18 a 25 peso normal (saludable)
//		25 a 30 de sobrepeso (obesidad grado I)
//		30 a 35 años de sobrepeso crónico (obesidad grado II)
//		35 a 40 de obesidad premórbida (grado III de obesidad)
//		> 40 obesidad mórbida (grado IV de obesidad)
//		Nota 1: Se recomienda el uso de declaraciones anidadas si - de lo contrario se recomienda.
//		Nota 2: Los operandos (peso y altura) deben ser introducidos por el usuario mediante el teclado.

	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("PESO (Kg): ");
		double peso = sc.nextDouble();
		
		System.out.println("ALTURA (M): ");
		double altura = sc.nextDouble();
		
		double imc = (peso / Math.pow(altura, 2));
		
		if (imc < 16) {
			System.out.println("Ingresar Hospital");
		} else if (imc >= 16 && imc < 18) {
			System.out.println("Bajo Peso");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Obesidad Grado 1");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidad Grado 2");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidad Grado 3");
		} else {
			System.out.println("Obesidad Grado 4");
		}
		
	}

}
