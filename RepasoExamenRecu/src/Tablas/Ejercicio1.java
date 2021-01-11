package Tablas;

import java.util.Scanner;

public class Ejercicio1 {

// 	Lee n números enteros, guárdalos en la tabla y muestra la media de los positivos, media negativa y número de ceros

private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad, SumaPositivos=0,SumaNegativos=0,ContadorPositivos=0,ContadorNegativos=0,ContadorCeros=0;
		System.out.println("Diga cuántos números va a introducir");
		cantidad=sc.nextInt();
		int[]numeros=new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca número: ");
			numeros[i]=sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0) {
				SumaPositivos=SumaPositivos+numeros[i];
				ContadorPositivos++;
			}else if(numeros[i]<0) {
				SumaNegativos=SumaNegativos+numeros[i];
				ContadorNegativos++;
			}else {
				ContadorCeros++;
			}
		}	
		
		if(ContadorPositivos>0) {
			System.out.println("La media de números positivos es: "+ (SumaPositivos/ContadorPositivos));
		}else {
			System.out.println("No ha introducido ningún número positivo");
		}
		if(ContadorNegativos>0) {
			System.out.println("La media de números negativos es: "+ (SumaNegativos/ContadorNegativos));
		}else {
			System.out.println("No ha introducido ningún número negativo");
		}
		System.out.println("Ha introducido: " + (ContadorCeros)+ " veces el 0");
	}
	

}