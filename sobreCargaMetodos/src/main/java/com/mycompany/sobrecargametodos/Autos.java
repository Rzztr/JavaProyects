package com.mycompany.sobrecargametodos;
public class Autos {
    String marca; 
    int modelo;
    String color;
    int velocidad;
    
    
//    public Autos(){
//        this.marca="";
//        this.modelo=0;
//        this.color="";
//        this.velocidad=0;
//    }

    
    public Autos() {
        
    }

    public Autos(String marca,int modelo, int velocidad) {
        this.marca= marca;
        this.modelo = modelo;
        this.velocidad=velocidad;
    }
    

    public Autos(String marca, int modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
}
