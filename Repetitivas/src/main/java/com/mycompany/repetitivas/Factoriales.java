package com.mycompany.repetitivas;
import java.util.Scanner;
public class Factoriales {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Eleccion =1 ;
        int Resultado=1 ;
        System.out.println("Elije un numero menor a 10: ");
        Eleccion = Entrada.nextInt();
        for (int i = 1; i <= Eleccion; i++) {
            Resultado *= i;
        }
                
        System.out.println("El resultado es: "+ Resultado);
    }
    
}
