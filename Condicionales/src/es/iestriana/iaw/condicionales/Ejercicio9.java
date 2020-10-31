package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	/*Pregunte por dia, mes y año y muestra la fecha del día siguiente. Asume que todos los meses son 30 dias.
	 * 
	 */
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce dia: ");
		int dia = sc.nextInt();
		
		System.out.println("Introduce mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Introduce anyo: ");
		int anyo = sc.nextInt();
	
		dia++;
		
		//Voy a calcular cuantos días tiene un mes
		int diasDelMes= 0;
		
		boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 !=0) || (anyo % 400 ==0));
		switch (mes) {
		case 2:
			if (esBisiesto) {
				diasDelMes = 29;
			}else {
				diasDelMes = 28;
			}

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasDelMes= 31;
			break;
		default:
			diasDelMes = 30;
			break;
		}
		
		// Comprobar si nos hemos pasado del número de días
		if (dia > diasDelMes) {
			dia = 1;
			mes++;
			// Comprobar si el mes es mayor de los que tiene un año
			if (mes > 12) {
				mes =1;
				anyo++;
			}
		}
		
		System.out.println("Fecha: " + dia + "/" + mes + "/" + anyo);
		sc.close();
	}
}