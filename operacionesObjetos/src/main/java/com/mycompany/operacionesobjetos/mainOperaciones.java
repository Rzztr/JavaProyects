package com.mycompany.operacionesobjetos;
import java.util.Scanner;
public class mainOperaciones {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero... ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero... ");
        num2 = entrada.nextInt();
        
        Operaciones operaciones1= new Operaciones(num1, num2);
        Operaciones operaciones2 = new Operaciones(num1, num2);
        Operaciones operaciones3 = new Operaciones(num1, num2);
        
        
        operaciones1.sumarNumeros();
        operaciones2.restarNumeros();
        operaciones3.multiplicarNumeros();
    }
    
}
