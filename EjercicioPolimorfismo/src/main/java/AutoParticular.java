public class AutoParticular extends Vehiculo {
    protected int numPuertas;

    public AutoParticular(int numPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
    }
    @Override
    public void mostratDatos(){
        System.out.println(super.toString()+"\nnumero de puertas: "+numPuertas);
    }
    public int getNumPuertas() {
        return numPuertas;
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
        return super.toString()+"\nnumPuertas: " + numPuertas;
    }
    
    
    
}
