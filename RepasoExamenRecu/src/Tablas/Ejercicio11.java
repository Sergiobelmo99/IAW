package Tablas;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Ejercicio11 {

	
	// Declarar 2 tablas unidimensionales de n elementos. Almacena en la primera el nombres y en el segundo las marcas de los estudiantes. Inicializa automáticamente valores de las dos tablas (utiliza random y randomuid). Crear un método que mostrar los nombres de los estudiantes y sus calificaciones. Crear otro método que almacene en otra mesa los estudiantes que han pasado. Muestra el resultado. Crear otro método para modificar la calificación de un estudiante solicitado al usuario. Crear otro método que devuelve una tabla con los estudiantes que han sacado más puntuación que el grado que uno solicitado al usuario
	private static Scanner sc = new Scanner(System.in);
	private static String[] alumnos = new String [10];
	private static int [] notas = new int[10];
	private static String [] aprobados = new String[10];
	
	public static void main(String[] args) {
		
		RellenarTablas();
		MostrarCalificaciones();
		EstudiantesAprobados();
		ModificarNota();
		
	}

private static void ModificarNota() {
		String alum;
		int nota;
		System.out.println("Introduzca el alumno al que quiere modificar la nota: ");
		alum=sc.next();
		System.out.println("Introduzca nueva nota: ");
		nota=sc.nextInt();
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i]==alum) {
				notas[i]=nota;
			System.out.println("Alumno: " + alumnos[i] + " Nota: " + notas[i]);
			}
		}
		
		
	}

private static void EstudiantesAprobados() {
	int contador=0;
	for (int i = 0; i < alumnos.length; i++) {
		if(notas[i]>=5) {
				aprobados[contador]=alumnos[i];
				contador++;
		}
	}
		
	System.out.println("ALUMNOS APROBADOS");
	System.out.println("******************");
	for (int i = 0; i < alumnos.length; i++) {
		if (aprobados[i]!=null) {
			System.out.println(aprobados[i]);
		}
		
	}
}

private static void MostrarCalificaciones() {
	for (int i = 0; i < alumnos.length; i++) {
		System.out.println("Alumno: " + alumnos[i] + " Nota: " + notas[i] );
	}
	
	}

private static void RellenarTablas() {
 
	for (int i = 0; i < alumnos.length; i++) {
		alumnos[i]=UUID.randomUUID().toString();
		notas[i] = new Random().nextInt(11);
	}
	
}

}
