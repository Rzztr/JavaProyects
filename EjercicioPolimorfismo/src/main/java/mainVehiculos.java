public class mainVehiculos {
    public static void main(String[] args) {
        AutoParticular v1 = new AutoParticular(4, "220191", "Toyota", "2022");
        Camioneta v2 = new Camioneta(6, "210723", "Nissan", "2023");
        Camion v3 = new Camion(4, "211122", "Vovlo", "2022");
        
        //Metodos onjeto 1
        v1.mostratDatos();
        
        System.out.println("--------------------------------------------------");
        
        //Metodo objeto 2
        v2.mostratDatos();
        
        System.out.println("--------------------------------------------------");
        
        //Metodos objeto 3
        v3.mostratDatos();
        
    }
}
