public class main {
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico("Estufaaa", "Mabe", 10000);
        Refrigerador r1 = new Refrigerador(10, 0, "refrigerador", "LG", 15000);
        EstufaElectrica e2 = new EstufaElectrica(220, 9, "estufa", "Whirlpool", 12000);
        EstufaGas e3 = new EstufaGas(6, "Estufa", "LG", 10000);
        
        //Metodos estufa 1
        System.out.println(e1.toString());
        
        System.out.println("--------------------------------------------------");
        
        //Metodos refrigerador 
        System.out.println(r1.toString());
        r1.congelar(-3);
        r1.refigerar();
        
        System.out.println("--------------------------------------------------");
        
        //Metodos estufa 2
        System.out.println(e2.toString());
        e2.funcionamiento();
        e2.hornear(300);
        
        System.out.println("--------------------------------------------------");
        
        //Metodos estufa 3
        System.out.println(e3.toString());
        e3.funcionamiento();
        
        
    }
}
