public class Herbivoro extends Animal {
    public Herbivoro(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void alimentarse() {
        System.out.println("Este animal se alimenta de hierbas");
    }
    
    
    
}
