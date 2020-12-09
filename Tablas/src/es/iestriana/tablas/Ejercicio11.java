package es.iestriana.tablas;

public class Ejercicio11 {

	
	
	/*
	 * Tabla de n elementos. Escriba un programa que calcule cuántos números diferentes hay en la tabla
	 */
	
	
	
	public static void main(String[] args) {


		int [] numeros= {2,2,4,4,5,6,7,7};
		int []contador= new int[8];
		
		for (int i = 0; i <numeros.length; i++) {
			
			contador[numeros[i]]+=1;
			
		}
		
		for (int j = 0; j < contador.length; j++) {
			
			System.out.println("Número " +j+ " se repite: " + contador[j] + " Veces.");
			
		}
		
		
	}

}
