package es.ejercicios.iaw.repasomios;

public class Ejercicio26 {

	
	/*
	 * Hay que mostrar un contador de 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad de que cada vez que aparece un 3 se sustituye por una E.
	 */
	
	
	public static void main(String[] args) {

		int x =0;
		for(int i=0;i<=9;i++){ // Números del 0 al 9 para mostrar
		for(int j=0;j<=5;j++){ // Cantidad de veces que se repite el número
 		if (x==3){
		System.out.print("-"+"E");
		}else{
		System.out.print("-"+x);
		}
		}
		x++;
		System.out.println("");
		}
		
	}

}
