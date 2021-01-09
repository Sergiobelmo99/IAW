package Bucles;


public class Ejercicio026 {

	// Hay que mostrar un contador de 5 dígitos (X-X-X-X-X), que muestre los números
	// del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad de que cada vez que aparece
	// un 3 se sustituye por una E.

	public static void main(String[] args) {
		String primero, segundo, tercero, cuarto, quinto;

		for (int i = 0; i <= 9; i++) {
			if (i == 3) {
				primero = "E";
			} else {
				primero = Integer.toString(i);
			}
			for (int j = 0; j <= 9; j++) {
				if (j == 3) {
					segundo = "E";
				} else {
					segundo = Integer.toString(j);
				}
				for (int k = 0; k <= 9; k++) {
					if (k == 3) {
						tercero = "E";
					} else {
						tercero = Integer.toString(k);
					}
					for (int l = 0; l <= 9; l++) {
						if (l == 3) {
							cuarto = "E";
						} else {
							cuarto = Integer.toString(l);
						}
						for (int m = 0; m <= 9; m++) {
							if (m == 3) {
								quinto = "E";
							} else {
								quinto = Integer.toString(m);
							}
							System.out.println(primero + "-" + segundo + "-" + tercero + "-" + cuarto + "-" + quinto);
						}
					}
				}
			}
		}
	}
}
