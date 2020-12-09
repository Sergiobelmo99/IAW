package es.ejercicios.iaw.repasomios;


public class Ejercicio10 {

	// Design a program that shows the product of the first 10 odd numbers.

	public static void main(String[] args) {
		
	int producto= 1;
		
		
		for (int i = 1; i <10 ; i+=2) {
			producto = producto*i;
			}
		System.out.println("El producto de los números es : " + producto);
		}	
	
}


