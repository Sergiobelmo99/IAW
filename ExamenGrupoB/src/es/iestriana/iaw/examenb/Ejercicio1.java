package es.iestriana.iaw.examenb;

import java.util.Scanner;

public class Ejercicio1 {

	
	/*
	 * 1. Programa que solicita tres n�meros y realiza las siguientes acciones:
- Muestra el valor central de los tres valores num�ricos
- Muestra si alguno de los valores es m�ltiplo de otro de los valores
- Debe mostrar un mensaje diciendo si el valor central est� m�s cerca del menor que del mayor. Por ejemplo, si los tres valores fueran 1,15,200 deber�a decir que "El valor central 15 est� m�s cerca del valor 1"
- Muestre el valor de la multiplicaci�n de todos los divisores del valor central

	 */
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int mayor;
        int medio;
        int menor;
		
        System.out.println("Introduce N�mero 1:");
        int numero1 = sc.nextInt();
        
        System.out.println("Introduce N�mero 2:");
        int numero2 = sc.nextInt();
        
        
        System.out.println("Introduce N�mero 3:");
        int numero3 = sc.nextInt();
        
        
        if(numero1 > numero2 && numero1 > numero3){
            mayor= numero1;
            if(numero2> numero3){
                    
            medio = numero2;
            menor = numero3;
                }else{
                    
                    medio = numero2;
                    menor = numero3;
                }
            System.out.println("El n�mero mayor es:" + mayor + " El n�mero medio es: " + medio+ " El n�mero menor es:" + menor);           
        }
        
        if(numero2 > numero1 && numero2 > numero3){
            mayor= numero2;
            if(numero1 > numero3){
                    
            medio = numero1;
            menor = numero3;
                }else{
                
                medio = numero3;
                menor = numero1;
            }
            System.out.println("El n�mero mayor es: " + mayor + " El n�mero medio es: " + medio+ " El n�mero menor es: " + menor);        
            
        }
        
        if(numero3 > numero1 && numero3 > numero2){
            mayor= numero3;
            if(numero2> numero1){
                    
            medio = numero2;
            menor = numero1;
                }else{
                    
                    medio = numero1;
                    menor = numero2;
                }
                    
            System.out.println("El n�mero mayor es: " + mayor + " El n�mero medio es: " + medio+ " El n�mero menor es: " + menor);        
            
        }    
    }
}


