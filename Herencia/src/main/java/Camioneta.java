public class Camioneta extends Vehiculo{
    
    private int capacidadCarga;

    public Camioneta(int capacidadCarga, String marca) {
        super(marca);
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(int capacidadCarga, String modelo, String marca, String color) {
        super(modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString()+ " capacidadCarga: " + capacidadCarga+" toneladas";
    }
    
    
    
}
