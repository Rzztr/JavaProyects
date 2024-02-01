public class Estufa extends Electrodomestico{
    protected int NoParrillas;

    public Estufa(int NoParrillas, String nombre, String marca, double precio) {
        super(nombre, marca, precio);
        this.NoParrillas = NoParrillas;
    }
    
    public void funcionamiento(){
    }
    
    
}
