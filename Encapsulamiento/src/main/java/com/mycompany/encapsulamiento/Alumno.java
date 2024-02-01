package com.mycompany.encapsulamiento;
public class Alumno {
    private String nombre;
    int edad;
    boolean aprobado;
    
    //constructor 
    
    public Alumno (String nombre, int edad, boolean aprobado){
        this.nombre=nombre;
        this.edad=edad;
        this.aprobado=aprobado;
    }
    //get 
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
 