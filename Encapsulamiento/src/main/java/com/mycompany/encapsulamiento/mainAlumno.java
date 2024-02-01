package com.mycompany.encapsulamiento;
public class mainAlumno {
    public static void main(String[] args) {
        Alumno a1= new Alumno("Ricardo", 18, false);
        System.out.println("Nombre del alumno "+a1.getNombre());
        a1.setNombre("Christopher");
        System.out.println("Nombre del alumno "+a1.getNombre());
    }
    
}
