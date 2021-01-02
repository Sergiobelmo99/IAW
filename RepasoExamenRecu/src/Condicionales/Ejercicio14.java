package Condicionales;

import java.util.Scanner;

public class Ejercicio14 {

		private static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        
	        double Coea=0,Coeb=0,Coec=0,x1=0,x2=0,ProR=0;        
	        
	        System.out.println("Ingrese el Coeficiente a");
	        Coea = sc.nextDouble();
	        
	        System.out.println("Ingrese el Coeficiente b");
	        Coeb = sc.nextDouble();
	        
	        System.out.println("Ingrese el Coeficiente c");
	        Coec = sc.nextDouble();
	        
	        if(Coea<0){
	           Coea=Coea*-1;
	           Coeb=Coeb*-1;
	           Coec=Coec*-1;
	        }
	        ProR=(Coeb*Coeb)-(4*Coea*Coec);
	        
	        x1=(-Coeb+Math.sqrt(ProR))/(2*Coea);
	        x2=(-Coeb-Math.sqrt(ProR))/(2*Coea);
	        
	        System.out.println("Solucion -:"+x1);
	        System.out.println("Solucion -:"+x2);
	        
	    }
	    
	}