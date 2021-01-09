package Bucles;

import java.util.Scanner;

public class Ejercicio017 {

	// Una empresa que se dedica a la venta de desinfectantes necesita un programa
	// para gestionar las facturas. Cada factura contiene: el código de la partida,
	// la cantidad vendida en litros y el precio por litro. Se solicita a partir de
	// 5 facturas introducidas: Facturación total, cantidad en litros vendidos del
	// artículo 1 y cuántas facturas fueron emitidas por más de 600 euros.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int CodigoArticulo, MasDe600 = 0;
		double precio, Totallitros1 = 0, litros = 0, TotalFacturas = 0;

		System.out
				.println("Tiene que introducir los datos de 5 facturas." + "Loa códigos de artículos van desde 1 a 5");
		for (int i = 1; i <= 5; i++) {
			do {
				System.out.println("Factura nº " + i + "\n" + "***********************");
				System.out.println("Intrduzca el código del artículo");
				CodigoArticulo = sc.nextInt();
				System.out.println("Introducza la cantiad en litros: ");
				litros = sc.nextDouble();
				System.out.println("Introduzca el precio; ");
				precio = sc.nextDouble();
				if (CodigoArticulo < 1 || CodigoArticulo > 5 || precio <= 0 || litros <= 0) {
					System.out.println("Los datos introducidos para la Factura nº " + i
							+ "Son incorrectos!!!!. Introdúzcalos de nuevo");
				}
			} while (CodigoArticulo < 1 || CodigoArticulo > 5 || precio <= 0 || litros <= 0);

			TotalFacturas += (precio * litros);
			if (CodigoArticulo == 1) {
				Totallitros1 += litros;
			}
			if (precio * litros > 600) {
				MasDe600++;
			}
		}
		System.out.println(
				"El total facturado es: " + TotalFacturas + "\n" + "Cantidad en litros vendida para el artículo 1: "
						+ Totallitros1 + "\n" + "Hay " + MasDe600 + " facturas superiores a 600 euros");
		sc.close();

	}

}
