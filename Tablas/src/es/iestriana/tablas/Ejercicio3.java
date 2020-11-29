package es.iestriana.tablas;

import java.util.Random;


public class Ejercicio3 {

	// Lea la tabla de n números y guarde los números pares en otra tabla y los impares en otra tabla.

	
	private static int [] tablamama = new int [25];
	private static int [] tablapar = new int [25];
	private static int [] tablaimpar = new int [25];
	public static void main(String[] args) {
		
		rellenarTabla();
		dividirtabla();
		
	
	}
	private static void dividirtabla() {
		int j=0;
		int h=0;
		for (int i = 0; i < tablamama.length; i++) {
			if (i%2==0) {
				tablapar[j] = tablamama[i];
				j++;
				System.out.println(i
						+ "Este numero es par ");
			} else {
				tablaimpar[h] = tablamama[i];
				h++;
				System.out.println(i + "Este numero es impar");
			}
		}
		
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tablamama.length; i++) {
			tablamama[i] = new Random().nextInt(100);
			
		}
		
	}

}
