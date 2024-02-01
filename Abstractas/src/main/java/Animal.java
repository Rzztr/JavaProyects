public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    public abstract void alimentarse();

    @Override
    public String toString() {
        return "nombre: " + nombre + ", especie: " + especie;
    }
    
    
}
