public class Camioneta extends Vehiculo{
    protected int capacidadPersonas; 

    public Camioneta(int capacidadPersonas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public void mostratDatos(){
        System.out.println(super.toString()+"\ncapacidad personas: "+capacidadPersonas);
    }
    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncapacidadPersonas: " + capacidadPersonas;
    }
    
    
    
}
