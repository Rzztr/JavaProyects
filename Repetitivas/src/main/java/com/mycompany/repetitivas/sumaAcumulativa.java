package com.mycompany.repetitivas;
import java.util.Scanner;
public class sumaAcumulativa {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        boolean loop= true;
        while (loop==true){
            System.out.println("Ingresa un numero para acumularlo: ");
            numero = Entrada.nextInt();
            if (numero>0) {
                suma=numero+suma;
            System.out.println("resultado = " + suma); 
            }else{
                loop=false;
            }
        }
    }
}       
