package es.iestriana.fundamentos.general;

public class Tipos {
	
	public static void main(String[] args) {
		
		System.out.println("Hola");
		
		// Comentario de una l�nea 
		/*
		 * Comentario de varias l�neas
		 */
		// Entero
		/*byte b; // 8 bits
		short sh; // 16 bits
		int i; // 32 bits
		long l; // 64 bits
		*/
		char ch = 110;
		System.out.println(ch);
		
		//reales
		float f; // 32 bits
		double d; // 64 bits
		
		f = 3.1416F;
		d = 3.1416;
		System.out.println(Math.PI);
		
		// L�gicos 
		boolean bol = false; // true
		
		// Cadenas 
		String cad = "Primera Cadena";
		String cad1 = "Segunda Cadena";
		System.out.println(cad + " "+ cad1);
		System.out.println("PI:" + Math.PI);
		
		Integer ii = 4;
		Character cc;
		System.out.println(cad.substring (0, 8));
		
	}

}
