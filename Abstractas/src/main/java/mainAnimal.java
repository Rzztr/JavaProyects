public class mainAnimal {
    public static void main(String[] args) {
        Carnivoro a1 = new Carnivoro("Leon", "Felino");
        Herbivoro a2 = new Herbivoro("Vaca", "Bobino");
        
        
        System.out.println(a1.toString());  
        a1.alimentarse();
        a1.nombre="Tigre";
        System.out.println(a1.toString()); 
        
        
        System.out.println(a2.toString());
        a2.alimentarse();
        
        

    }
    
}
