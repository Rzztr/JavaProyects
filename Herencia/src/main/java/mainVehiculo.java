public class mainVehiculo {
    public static void main(String[] args) {
        Camioneta v1 = new Camioneta(13, "Toyota");
        Camioneta v2 = new Camioneta(12, "2020", "DODGE", "Azul");
        vehiculoDeportivo v3 = new vehiculoDeportivo(120, "2022", "Supra", "Gris");
        Moto v4 = new Moto(2, "2022", "Kawasaki", "bicolor");
        
        System.out.println(v1.toString());
        System.out.println("--------------------------------------------------");
        System.out.println(v2.toString());
        
        System.out.println("--------------------------------------------------");
        v3.setVelocidad(60);
        System.out.println(v3.limVelocidad());
        System.out.println(v3.toString());
        v3.limVelocidad();
        System.out.println("--------------------------------------------------");
        
        v4.setNumRudedas(1);
        System.out.println(v4.toString());
        v4.numRuedas();
    }
    
}
