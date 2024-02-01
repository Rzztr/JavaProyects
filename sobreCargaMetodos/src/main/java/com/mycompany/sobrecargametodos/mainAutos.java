package com.mycompany.sobrecargametodos;
import java.util.Scanner;
public class mainAutos {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        String marca= null; 
        int modelo= 0;
        int velocidad=0;
        
        Autos auto1= new Autos("", 0, 0);

        System.out.println("Ingrese la marca del auto: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del auto: ");
        modelo = entrada.nextInt();
        System.out.println("Ingrese la velocidad del auto: ");
        
        
        
        System.out.println("La marca del auto es "+auto1.marca);
        System.out.println("El modelo del auto es: "+auto1.modelo);
        System.out.println("La velocidad es: "+auto1.velocidad);
    }
    
}
