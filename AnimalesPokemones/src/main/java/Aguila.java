public class Aguila extends Animal implements Garras, Alas, Plumas, Patas{

    public Aguila(String nombre, String especie, String habitat) {
        super(nombre, especie, habitat);
    }
    public void planear(){
        System.out.println("EL aguila esta planeando");
    }

    @Override
    public void cazar() {
        System.out.println("El aguila esta cazando");
    }

    @Override
    public void trepar() {
   
    }

    @Override
    public void volar() {
        System.out.println("El aguila esta volando");
    }

    @Override
    public void nadar() {
    }

    @Override
    public void protejerFrio() {
        System.out.println("Esta aguila se esta protejiendo del frio");
    }

    @Override
    public void protejerViento() {
        System.out.println("Esta aguila se esta protejiendo del viento");
    }

    @Override
    public void caminar() {
        System.out.println("EL aguila esta caminando");
    }

    @Override
    public void correr() {
    }

    @Override
    public void saltar() {
        System.out.println("EL aguila salto un obstaculo");
    }

    @Override
    public void sujetar() {
        System.out.println("El aguila esta sijentando un raton");
    }
    
}
