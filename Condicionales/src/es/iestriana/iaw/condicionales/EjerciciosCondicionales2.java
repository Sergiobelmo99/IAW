package es.iestriana.iaw.condicionales;

import java.util.Scanner;

public class EjerciciosCondicionales2 {
	
	/*
	 *  2. A worker needs to calculate his weekly salary based on the hours he works (requested data) which is obtained in the following way:
 If you work 40 hours or less you are paid € 16 per hour
 If you work more than 40 hours, you are paid € 16 for each of the first 40 hours and € 20 for each overtime.

	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce las horas: ");
		int horas = sc.nextInt();
		int sueldo;
		if (horas < 40) {
			sueldo = 16 * horas;
		}else {
			sueldo = (40 * 16) +((horas - 40) * 20);
		}
		System.out.println("El sueldo semanal es: " +sueldo + " euros");
		sc.close();
	}

}

