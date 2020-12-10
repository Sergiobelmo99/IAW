package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * Lee dos series de números n. Guárdelos en dos tablas. Ordena las tablas. Fusión las 2 tablas en una tabla de 2 * n elementos para que esta tabla esté ordenada
	 */

		private static Scanner sc = new Scanner(System.in);
		private static int size = 0;

		public static void main(String[] args) {

		do {
		System.out.println("Please enter number of elements for both tables (more than zero):");
		size = sc.nextInt();
		} while (size <= 0);

		int [] table1 = new int[size];
		int [] table2 = new int[size];
		int [] merged = new int[size*2];

		fillTable1(table1);
		fillTable2(table2);
		merged = mergeTables(table1,table2);
		System.out.println("Table 1 is: " + Arrays.toString(table1));
		System.out.println("Table 2 is: " + Arrays.toString(table2));
		System.out.println("The merged and ordered table is: " + Arrays.toString(merged));


		sc.close();
		}
		private static int[] mergeTables(int[] table1, int[] table2) {
		int [] merged = Arrays.copyOf(table1, size*2);
		for (int i = size; i < size*2; i++) {
		//for (int j = 0; j < size; j++) {
		//}
		merged[i] = table2[i-size];
		} Arrays.sort(merged); return merged;
		}
		private static void fillTable2(int[] table2) {
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter new element of Table 2:");
		table2[i] = sc.nextInt();
		} Arrays.sort(table2);
		}
		private static void fillTable1(int[] table1) {
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter new element of Table 1:");
		table1[i] = sc.nextInt();
		} Arrays.sort(table1);
		}


	}

