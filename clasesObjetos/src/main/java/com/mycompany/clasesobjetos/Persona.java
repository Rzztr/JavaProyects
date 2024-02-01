package com.mycompany.clasesobjetos;
public class Persona {
    //atributos
    String nombre;
    String apellido;
    int edad;
    String preferencias;
    
    public Persona(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.preferencias="";
    }
    public Persona(String nombre ,String apellidos, int edad, String preferencias){
        this.nombre=nombre;
        this.apellido=apellidos;
        this.edad=edad;
        this.preferencias=preferencias;
    }
    public void desplegarNombres(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
    }
    public void mostrarInformacion(){
        System.out.println(nombre+", "+apellido+", "+edad+", "+preferencias);
    }
    public void mostrarEdad(){
        System.out.println(nombre+" Tiene "+edad+" años" );
    }
    public void comer(){
        System.out.println(nombre+ ""+apellido+""+ "esta comiendo");
    }
    public void desplazarse(){
        System.out.println(nombre+" "+ "esta desplazandose");
    }
    public void necesidades(){
        System.out.println(nombre+" "+"Esta llendo al baño...");
    }
    public void estudiando(){
        System.out.println(nombre+" "+"Esta en la universidad estudiando" );
    }
    public void mimir(){
        System.out.println(nombre + " Esta durmiendo");
    }
    public void preferencias(){
        System.out.println(nombre+" es "+ preferencias);
    }
}
