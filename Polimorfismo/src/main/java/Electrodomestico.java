public class Electrodomestico {
    protected String nombre;
    protected String marca;
    protected double precio;

    public Electrodomestico(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", marca: " + marca + ", precio: " + precio;
    }
    
    
    
}
