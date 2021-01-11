package Tablas;

import java.util.Scanner;

public class Ejercicio1 {

// 	Lee n n�meros enteros, gu�rdalos en la tabla y muestra la media de los positivos, media negativa y n�mero de ceros

private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad, SumaPositivos=0,SumaNegativos=0,ContadorPositivos=0,ContadorNegativos=0,ContadorCeros=0;
		System.out.println("Diga cu�ntos n�meros va a introducir");
		cantidad=sc.nextInt();
		int[]numeros=new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca n�mero: ");
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
			System.out.println("La media de n�meros positivos es: "+ (SumaPositivos/ContadorPositivos));
		}else {
			System.out.println("No ha introducido ning�n n�mero positivo");
		}
		if(ContadorNegativos>0) {
			System.out.println("La media de n�meros negativos es: "+ (SumaNegativos/ContadorNegativos));
		}else {
			System.out.println("No ha introducido ning�n n�mero negativo");
		}
		System.out.println("Ha introducido: " + (ContadorCeros)+ " veces el 0");
	}
	

}