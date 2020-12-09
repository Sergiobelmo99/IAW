package es.iestriana.iaw.examenb;

import java.util.Scanner;

public class Ejercicio2 {

	
	/*
	 * Una empresa de hosting tiene ordenadores similares dentro de camiones. Cada camión puede cargar como máximo 30000 kg. Realiza un programa que solicite el peso de un ordenador (int) y averigüe cuántos ordenadores puede cargar en el camión. Las únicas operaciones aritméticas que se pueden utilizar son la suma y/o la resta.
(3,3 Ptos) 3.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int pesocamion=30000;
		int ordenadores;
		int resta=0;
		
		
		do {
			System.out.println("Introduce peso de ordenador: ");
			ordenadores = sc.nextInt();
			resta= pesocamion-ordenadores;
			System.out.println(resta);
		} while (pesocamion> 0);
			
			
		}
		

	}
