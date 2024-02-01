public class Refrigerador extends Electrodomestico {
    protected int capacidad;
    protected int noPuertas;

    public Refrigerador(int capacidad, int noPuertas, String nombre, String marca, double precio) {
        super(nombre, marca, precio);
        this.capacidad = capacidad;
        this.noPuertas = noPuertas;
    }
    
    public void congelar(int grados){ 
        System.out.println("se estan congelando los alimentos a "+grados+" grados");
    }
    public void refigerar(){
        System.out.println("Se estan refrigerando "+capacidad+" kg de alimentos en total");
    }
    
}
