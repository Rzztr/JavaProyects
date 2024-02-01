public class Moto extends Vehiculo{
    private int numRuedas;

    public Moto(int numRudedas, String modelo, String marca, String color) {
        super(modelo, marca, color);
        this.numRuedas = numRudedas;
    }
    public int getNumRudedas() {
        return numRuedas;
    }

    public void setNumRudedas(int numRudedas) {
        this.numRuedas = numRudedas;
    }
    public int numRuedas(){
        switch(numRuedas){
            case 2:
                System.out.println("Moto para repartidor");
                break;
            case 4:
                System.out.println("Moto de montaña");
                break;
            case 3:
                System.out.println("Esa madre es para policias pa'");
        }
        return numRuedas;
    }
    @Override
    public String toString() {
        return super.toString()+ " numRuedas: " + numRuedas;
    }
    
    
}
