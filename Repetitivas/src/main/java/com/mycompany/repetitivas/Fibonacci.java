package com.mycompany.repetitivas;

public class Fibonacci {
    public static void main(String[] args) {
      int Numero = 0;
      int Num = 1;
      
        for (int i = 1; i < 25; i++) {
            System.out.println(Numero);
            
            int Sucesor = Numero+Num;
            
            Numero =Num;
            Num= Sucesor;
        }
    
    }
    
}