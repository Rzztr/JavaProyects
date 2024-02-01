public class Mariposa extends Animal implements Alas, Patas{

    public Mariposa(String nombre, String especie, String habitat) {
        super(nombre, especie, habitat);
    }
    public void migrar(){
        System.out.println("La mariposa esta migrando hacia el sur");
    }
    @Override
    public void volar() {
        System.out.println("La mariposa esta vloando hacia una planta");
    }

    @Override
    public void nadar() {
        System.out.println("La mariposa no puede nadar");
    }

    @Override
    public void caminar() {
        System.out.println("La mariposa esta caminando sobre una planta");
    }

    @Override
    public void correr() {
        System.out.println(" ");
    }

    @Override
    public void saltar() {
        System.out.println(" ");
    }

    @Override
    public void sujetar() {
        System.out.println("La mariposa esta suetando una hoja");
    }
    
}
