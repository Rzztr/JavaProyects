package com.mycompany.repetitivas;
import java.util.Scanner;
public class operacionesBasicas {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        var num1 = 1;
        var num2 = 2;
        int eleccion = 1;
        boolean loop = true;
        
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Elije una opcion para realizar la operacion: ");
            System.out.println("1.- Suma ");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("Para salir teclea '0' ");
            eleccion = Entrada.nextInt();
            if (eleccion>=1) {
                System.out.println("Ingresa un primer numero: ");
                num1 = Entrada.nextInt();
                System.out.println("Ingresa un segundo numero: ");
                num2 = Entrada.nextInt();
                switch (eleccion){
                case 1: 
                    System.out.println("Suma= "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Resta= "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplicacion= "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division= "+(num1/num2));
                    break;
                case 0:
                    loop = false;
                case 5,6,7,8,9:
                    System.out.println("ingresa una opcion valida o teclea '0' ");
                }
            }else{
                loop=false;
            }
        } while (loop==true);
        System.out.println("Adios!");
    }
    
}
