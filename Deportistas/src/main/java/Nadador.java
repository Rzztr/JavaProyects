public class Nadador extends Deportista{
    boolean prueba;
    public Nadador(boolean prueba, String nombre, String apellidos, String nacionalidad) {
        super(nombre, apellidos, nacionalidad);
        this.prueba = prueba;
    }    
    public void ejercitarse(){
        System.out.println(nombre+" esta nadando...");
    }

    public boolean isPrueba() {
        return prueba;
    }

    public void setPrueba(boolean prueba) {
        this.prueba = prueba;
    }
    
}
