package Tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Crear una tabla de n n�meros y moverla hacia abajo una posici�n, es decir, el el primero se convierte en el segundo, el segundo se convierte en el tercero, y as� sucesivamente sucesivamente. El �ltimo se convierte en el primero
		
		int[] tabla= new int [10];
		RellenaTabla(tabla);
		System.out.print(Arrays.toString(tabla));
		System.out.println();
		MueveDatosTabla(tabla);
		System.out.println(Arrays.toString(tabla));
	}

	private static void MueveDatosTabla(int[] tabla) {
		int[] TablaCopia =new int[tabla.length];
		TablaCopia=Arrays.copyOfRange(tabla,0,tabla.length);
		for (int i = 1; i < tabla.length; i++) {
			tabla[i]=TablaCopia[i-1];
		}
		tabla[0]=TablaCopia[TablaCopia.length-1];
	}

	private static void RellenaTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i]= new Random().nextInt(50);
		}
		
	}
	
	
}

