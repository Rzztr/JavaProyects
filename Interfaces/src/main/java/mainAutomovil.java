public class mainAutomovil {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Manzanas", 5);
        Carro carro1 = new Carro(85);
        
        carro1.encender();
        carro1.acelerar();
        carro1.avanzar();
    }
}
