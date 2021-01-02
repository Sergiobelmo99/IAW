package Condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	// Pregunte por el d�a, el mes y el a�o y muestre la fecha del d�a siguiente.
	// Supongamos que todos los meses son 30 d�as

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("D�A: ");
		int dia = sc.nextInt();

		System.out.println("MES: ");
		int mes = sc.nextInt();

		System.out.println("A�O: ");
		int anyo = sc.nextInt();

		if (fechaCorrecta(dia, mes, anyo)) {
			// Primero, le sumo 1 al d�a. Compruebo la nueva fecha
			dia++;

			// Voy a calcular cuantos d�as tiene el mes
			int diasDelMes = 0;

			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0));
			switch (mes) {
			case 2:
				if (esBisiesto) {
					diasDelMes = 29;
				} else {
					diasDelMes = 28;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasDelMes = 31;
				break;
			default:
				diasDelMes = 30;
				break;
			}

			/*
			 * if (mes == 2) { if (esBisiesto) { diasDelMes = 29; } else { diasDelMes = 28;
			 * } } else if (mes == 1 || mes == 3 || ...) { diasDelMes = 31; } else {
			 * diasDelMes = 30; }
			 */

			// Comprobar si nos hemos pasado del n�mero de d�as
			if (dia > diasDelMes) {
				dia = 1;
				mes++;
				// Comprobar si el mes es mayor de los que tiene un a�o
				if (mes > 12) {
					mes = 1;
					anyo++;
				}
			}

			System.out.println("Nueva Fecha: " + dia + "/" + mes + "/" + anyo);
		} else {
			System.out.println("Fecha Incorrecta");
		}

		sc.close();
	}

	private static boolean fechaCorrecta(int dia, int mes, int anyo) {
		boolean fechaCorrecta = false;

		// Comprobar si es correcta la fecha
		if (anyo >= 0) {
			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0));
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if (dia >= 1 && dia <= 29 && esBisiesto) {
						fechaCorrecta = true;
					} else if (dia >= 1 && dia <= 28 && !esBisiesto) {
						fechaCorrecta = true;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						fechaCorrecta = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;
				default:
					/*
					 * if (dia >= 1 && dia <= 30) { fechaCorrecta = true; } break;
					 */
				}
			}
		}
		return fechaCorrecta;
	}

}