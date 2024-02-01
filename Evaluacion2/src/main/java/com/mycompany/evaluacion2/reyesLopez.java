package com.mycompany.evaluacion2;
import java.util.Scanner;
public class reyesLopez {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int numCuadrado1 = 0;
        int numCubo2 = 0; 
        
        System.out.println("Ingresa un numero: ");
        num1 = Entrada.nextInt();
        System.out.println("Ingresa el siguiente numero: ");
        num2 = Entrada.nextInt();
        
        numCuadrado1 = (num1*num1);
        numCubo2= (num2*num2)*num2;
        
        if (numCuadrado1>numCubo2) {
            System.out.println("El cudrado del primero es mayor que el cubo del segundo");
            
        }else{
            System.out.println("El cubo del segundo, es mayor que el cuadrado del primero");
        }
    }
    
}
