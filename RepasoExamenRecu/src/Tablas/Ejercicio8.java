package Tablas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	// Se pretende desarrollar una aplicación que nos ayude a gestionar las notas de
	// una la escuela. Cada clase está formada por 10 estudiantes. Se les pide que
	// lean las notas del primer, segundo y tercer trimestre almacenándolos en una
	// mesa. Debemos muestran la nota media final de cada estudiante y cada clase de
	// cada trimestre.
	// Por último, desarrollar un método que se pasa un número de estudiante y
	// devuelve el el promedio final de ese estudiante



	private static int[][] clase = new int[10][3];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int alumno;

		RellenarTabla(clase);
		NotaMediaPorAlummno(clase);
		NotaMediaClaseTrimestre(clase);

		// Pedir un alumno y mostrar su nota media

		do {
			System.out.println("Introduzca el código del alumno:");
			alumno = sc.nextInt();
			if (alumno < 0 || alumno > 9) {
				System.out.println("Código del alumno no es correcto");
			}

		} while (alumno < 0 || alumno > 9);

		NotaMediaUnAlumno(clase, alumno);

	}

	private static void NotaMediaUnAlumno(int[][] clase, int alumno) {
		int SumaNotas = 0;

		for (int i = 0; i < clase[i].length; i++) {
			SumaNotas = SumaNotas + clase[alumno][i];
		}
		System.out.println("Nota Media del alumno " + alumno + " = " + (SumaNotas / 3));
	}

	private static void NotaMediaClaseTrimestre(int[][] clase) {
		int SumaNotas = 0;
		System.out.println("Nota Media de la clase por Trimestre");
		System.out.println("***************************************");
		for (int i = 0; i < clase[i].length; i++) {
			for (int j = 0; j < clase.length; j++) {
				SumaNotas = SumaNotas + clase[j][i];
			}
			System.out.println("Trimeste " + i + ": " + (SumaNotas / 10));
			SumaNotas = 0;
		}
	}

	private static void NotaMediaPorAlummno(int[][] clase) {
		int SumaNotas = 0;
		System.out.println("Medina de Notas por alumno");
		System.out.print("*********************************" + "\n");
		for (int i = 0; i < clase.length; i++) {
			for (int j = 0; j < clase[i].length; j++) {
				SumaNotas = SumaNotas + clase[i][j];
			}
			System.out.println("Alumno: " + i + " Media: " + (SumaNotas / 3));
			SumaNotas = 0;
		}

	}

	private static void RellenarTabla(int[][] clase) {

		for (int i = 0; i < clase.length; i++) {
			for (int j = 0; j < clase[i].length; j++) {
				clase[i][j] = new Random().nextInt(11);
			}
		}
		// Mostramos el contenido de la tabla
		for (int i = 0; i < clase.length; i++) {
			for (int j = 0; j < clase[i].length; j++) {
				System.out.println("Alumno: " + i + " Trimeste: " + j + " Nota: " + clase[i][j]);
			}
		}

	}

}
