public class Carnivoro extends Animal{

    public Carnivoro(String nombre, String especie) {
        super(nombre, especie);
    }
    
    public void alimentarse(){
        System.out.println("Este animal se alimenta de carne");
    }
    
}
