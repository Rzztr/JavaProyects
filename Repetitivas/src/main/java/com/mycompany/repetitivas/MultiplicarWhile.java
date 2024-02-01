package com.mycompany.repetitivas;
import java.util.Scanner;
public class MultiplicarWhile {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numTabla = 1;
        int loop = 1;
        int i = 1;
        int tabla=1;
        while (loop==1){
            System.out.println("Ingresa un numero opara conocer su tabla de multiplicar: ");
            numTabla = Entrada.nextInt();
            if (numTabla>0) {
                while (i<=10){
                tabla = numTabla*i;
                System.out.println(numTabla+"X"+i+"= "+tabla);
                i++;
            }
            
            }
            else{
                loop=2;
                    }
            
        }
    }
    
}
