public class Carro implements Motor, Ruedas {
    protected int velocidad;

    public Carro(int velocidad) {
        this.velocidad = velocidad;
    }
    @Override
    public void encender() {
        System.out.println("EL carro esta encendido");
    }
    @Override
    public void apagar() {
        System.out.println("EL carro se esta apagando");
    }

    @Override
    public void acelerar() {
        System.out.println("El auto esta acelerando");
    }

    @Override
    public void avanzar() {
        System.out.println("El carro esta avanzando a "+velocidad+" Km/h");
    }

    @Override
    public void detener() {
        System.out.println("El carro se esta deteniendo");
    }
    
}
