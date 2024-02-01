public class vehiculoDeportivo extends Vehiculo{
    private int velocidad;

    public vehiculoDeportivo(int velocidad, String modelo, String marca, String color) {
        super(modelo, marca, color);
        this.velocidad = velocidad;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public int limVelocidad(){
        if (velocidad>60) {
            System.out.println("Excede el limite de velocidad");
        }else{
            System.out.println("Ta' bien de velocidad");
        }
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+ " velocidad: " + velocidad;
    }

    
    
}
