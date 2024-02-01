public class Camion implements Motor,Ruedas,Remolque{
    protected String producto;
    protected int toneladas;

    public Camion(String producto, int toneladas) {
        this.producto = producto;
        this.toneladas = toneladas;
    }

    
    
    
    @Override
    public void encender(){
        System.out.println("El camion esta encendido! ");
    }  

    @Override
    public void apagar() {
        System.out.println("El camion esta apagado");
    }

    @Override
    public void acelerar() {
        System.out.println("El camion esta acelerando");
    }

    @Override
    public void avanzar() {
        System.out.println("El camion esta avanzando");
    }

    @Override
    public void detener() {
        System.out.println("El camion se esta deteniendo");
    }

    @Override
    public void cargar() {
        System.out.println("El camion esta cargando "+toneladas+" toneladas de "+producto);
    }

    @Override
    public void descargar() {
        System.out.println("El camion esta descargando");
    }
}
