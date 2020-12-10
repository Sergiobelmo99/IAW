package es.iestriana.tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	
	/*
	 * Preguntar por los números hasta que se teclee el 0, mostrar la suma de todos los números introducidos.
	 */
	
	
	private static Scanner sc = new Scanner(System.in);
	private static int[] nTable = new int[30];
	private static int num = 0;

	public static void main(String[] args) {
	do {
	System.out.println("Please, enter a position in the array between 0 and 29: ");
	num = sc.nextInt();
	} while (num < 0 && num > 29);

	fillTable(nTable);

	System.out.println("The current array is: " + Arrays.toString(nTable));
	indexShift(nTable);

	int [] newTable = Arrays.copyOf(nTable, nTable.length - 1);

	System.out.println("The array after index shifting and compacting is: " + Arrays.toString(newTable));

	sc.close();
	}

	private static void indexShift(int[] nTable2) {
	for (int i = num; i < nTable2.length; i++) {
	if (i + 1 < 30) {
	nTable2[i] = nTable2[i + 1];
	}

	}
	}

	private static void fillTable(int[] nTable2) {
	for (int i = 0; i < nTable.length; i++) {
	nTable[i] = new Random().nextInt(100);
	}
	}

}


