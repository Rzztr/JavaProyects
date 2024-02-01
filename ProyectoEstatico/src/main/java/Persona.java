public class Persona {
    private int idPeronas;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.idPeronas = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPeronas() {
        return idPeronas;
    }

//    public void setIdPeronas(int idPeronas) {
//        this.idPeronas = idPeronas;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

//    public static void setContadorPersonas(int contadorPersonas) {
//        Persona.contadorPersonas = contadorPersonas;
//    }

    @Override
    public String toString() {
        return "idPeronas: " + idPeronas + ", nombre: " + nombre;
    }
    
}
