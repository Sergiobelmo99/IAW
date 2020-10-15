package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class EjercicioTres {

	/* Solicita al usuario un número de segundos y devuelve 
	 * las horas, minutos y segundos que lo forman
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, hora, minuto, segundo;
		System.out.println("Introduce el número: ");
		numero= sc.nextInt();
		hora=numero/3600;
		minuto=(numero-(3600 * hora))/60;
		segundo=numero-((hora*3600)+(minuto*60));
		System.out.println("Las Horas son:" + " " + hora + " "+
				"Los minutos son:"+ " "+ minuto + " "+
				"Los segundos son: "+ " " + segundo);
		

	}

}
