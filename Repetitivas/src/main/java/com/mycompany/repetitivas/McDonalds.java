package com.mycompany.repetitivas;
import java.util.Scanner;
public class McDonalds {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int senCarne = 100;
        int senQueso = 20;
        int senTomate = 10;
        int dobCarne = 200;
        int dobQueso = 40;
        int dobTomate = 20;
        int extCarne = 300;
        int extQueso = 60;
        int extTomate = 30;
        int totCarne= 0;
        int totQueso = 0;
        int totTomate = 0;
        int eleccion = 1;
        boolean loop = true;
        
        do {
            System.out.println("Bienvenido! haga su pedido c:");
            System.out.println("1.- Hamburguesa sencilla");
            System.out.println("2.- Hamburguesa Doble");
            System.out.println("3.- Hamburguesa Extra");
            System.out.println("Para salir introduzca 0");
            eleccion = Entrada.nextInt();
            if (eleccion>0) {
                switch(eleccion){
                    case 1:
                        totCarne = senCarne+totCarne;
                        totQueso = senQueso+totQueso;
                        totTomate= senTomate+totTomate;
                        break;
                    case 2:
                        totCarne = dobCarne+totCarne;
                        totQueso = dobQueso+totQueso;
                        totTomate= dobTomate+totTomate;
                        break;
                    case 3:
                        totCarne = extCarne+totCarne;
                        totQueso = extQueso+totQueso;
                        totTomate= extTomate+totTomate;
                        break;
                }
            }else{
                loop = false;
            }
        } while (loop==true);
            System.out.println("Insumos: ");
            System.out.println("Carne: "+totCarne);
            System.out.println("Queso: "+totQueso);
            System.out.println("Tomate: "+totTomate);
            System.out.println("Vuelva Pronto!");
    }
    
}
