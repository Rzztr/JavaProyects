
public class Persona {
    String nombre;
    String apellidos;
    int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "nombre: " + nombre + " apellidos: " + apellidos + " edad: " + edad;
    }

    
}
