package es.iestriana.iaw.examenb;

import java.util.Scanner;

public class Ejercicio2 {

	
	/*
	 * Una empresa de hosting tiene ordenadores similares dentro de camiones. Cada cami�n puede cargar como m�ximo 30000 kg. Realiza un programa que solicite el peso de un ordenador (int) y averig�e cu�ntos ordenadores puede cargar en el cami�n. Las �nicas operaciones aritm�ticas que se pueden utilizar son la suma y/o la resta.
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
