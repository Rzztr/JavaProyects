public class Camion extends Vehiculo{
    protected int carga;

    public Camion(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    @Override
    public void mostratDatos(){
        System.out.println(super.toString()+"\n puede trasnportar: "+carga+" toneladas");
    }
    
    public int getCarga() {
        return carga;
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
        return super.toString()+"\ncarga: " + carga;
    }
    
    
    
}
