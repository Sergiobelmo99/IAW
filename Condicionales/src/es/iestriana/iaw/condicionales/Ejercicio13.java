package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Ejercicio13 {

	/*
Construya un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que esa persona se basa en el valor de IMC:
Valor IMC Diagnóstico <16 Criterios de ingreso hospitalario
de 16 a 17 bajo peso
17 a 18 bajo peso
18 a 25 peso normal (saludable)
25 a 30 sobrepeso (obesidad grado I)
30 a 35 sobrepeso crónico (grado de obesidad II)
35 a 40 obesidad premórbida (obesidad de grado III)
> 40 obesidad mórbida (obesidad grado IV)
Nota 1: Se recomienda el uso de declaraciones if - else anidadas.
Nota 2: Los operandos (peso y altura) deben ser ingresados ​​por teclado por el usuario.
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