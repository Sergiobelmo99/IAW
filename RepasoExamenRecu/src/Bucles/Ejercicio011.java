package Bucles;

public class Ejercicio011 {

	// Dise�e un programa que muestre el producto de los primeros 10 n�meros
	// impares.

	public static void main(String[] args) {

		int producto=1;

		for (int i = 1; i <= 10; i=i+2) {

				producto = producto * i;

		}
		System.out.println("El producto es : " + producto);

	}

}
