package com.mycompany.clasesobjetos;
public class mainPersona {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Ricardo", "Reyes", 18, "panochas");
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Cuauhtemoc", "Arvizu", 20, "JOTO");
        
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
        
        
    }
}


