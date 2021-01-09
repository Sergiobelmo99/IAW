package Bucles;

import java.util.Scanner;

public class Ejercicio018 {

	// Igual que la anterior pero suponiendo que no se introduzca el precio por
	// litro. S�lo hay tres productos con precios: 1- 0,6 euros / litro, 2- 3 euros
	// / litro y 3- 1,25 euros / litro.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int CodigoArticulo, MasDe600 = 0;
		double Totallitros1 = 0, litros = 0, TotalFacturas = 0;

		System.out
				.println("Tiene que introducir los datos de 5 facturas." + "Loa c�digos de art�culos van desde 1 a 3");
		for (int i = 1; i <= 5; i++) {
			do {
				System.out.println("Factura n� " + i + "\n" + "***********************");
				System.out.println("Intrduzca el c�digo del art�culo");
				CodigoArticulo = sc.nextInt();
				System.out.println("Introducza la cantiad en litros: ");
				litros = sc.nextDouble();
				if (CodigoArticulo < 1 || CodigoArticulo > 3 || litros <= 0) {
					System.out.println("Los datos introducidos para la Factura n� " + i
							+ "Son incorrectos!!!!. Introd�zcalos de nuevo");
				}
			} while (CodigoArticulo < 1 || CodigoArticulo > 3 || litros <= 0);
			switch (CodigoArticulo) {
			case 1:
				TotalFacturas += (0.6 * litros);
				if (0.6 * litros > 600) {
					MasDe600++;
				}
				break;
			case 2:
				TotalFacturas += (3 * litros);
				if (3 * litros > 600) {
					MasDe600++;
				}
				break;
			default:
				TotalFacturas += (1.25 * litros);
				if (1.25 * litros > 600) {
					MasDe600++;
				}
				break;
			}

			if (CodigoArticulo == 1) {
				Totallitros1 += litros;
			}

		}
		System.out.println(
				"El total facturado es: " + TotalFacturas + "\n" + "Cantidad en litros vendida para el art�culo 1: "
						+ Totallitros1 + "\n" + "Hay " + MasDe600 + " facturas superiores a 600 euros");
		sc.close();

	}

}
