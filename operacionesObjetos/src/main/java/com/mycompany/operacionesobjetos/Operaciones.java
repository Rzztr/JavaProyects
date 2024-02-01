package com.mycompany.operacionesobjetos;
public class Operaciones {
    int num1 ;
    int num2 ;
    int suma;
    int resta;
    int multiplicacion;
    
    public Operaciones(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public Operaciones(){
        this.num1=0;
        this.num2=0;
        
    }
    public int sumarNumeros(){
        suma= (num1+num2);
        System.out.println("Suma es igual a: "+suma);
        return suma;
    }
    public int restarNumeros(){
        resta=(num1-num2);
        System.out.println("resta es igual a: "+resta);
        return resta;
    }
    public int multiplicarNumeros(){
        multiplicacion =(num1*num2);
        System.out.println("multiplicacion es igual a: "+multiplicacion);
        return multiplicacion;
    }    
}
