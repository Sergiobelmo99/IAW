package Tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	
	// Lea la tabla de n números y guarde los números pares en otra tabla y los impares en otra tabla.

private static int [] numeros = new int [20];
	
	public static void main(String[] args) {
		
		int pares []=Arrays.copyOfRange(numeros, 0, 20);
		int impares[] = Arrays.copyOfRange(numeros, 0, 20);
		int j=0, h=0;
		RellenarTabla();
		for (int i= 0; i< numeros.length;i++) {
			if(numeros[i]!=0) {
				if(numeros[i]%2==0) {
					pares[j]=numeros[i];
					j++;
				}else {
					impares[h]=numeros[i];
					h++;
				}
			}
			
		}
		System.out.print(Arrays.toString(numeros) + "\n");
		for (int i = 0; i < j; i++) {
			System.out.print(pares[i]+ " ");
		}
		System.out.println();
		for (int i = 0; i < h; i++) {
			System.out.print(impares[i] + " ");
		}
	}
	private static void RellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= new Random().nextInt(50);
		}
	}

}

