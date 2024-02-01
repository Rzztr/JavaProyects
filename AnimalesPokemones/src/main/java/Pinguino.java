public class Pinguino extends Animal implements Alas, Plumas, Patas {

    public Pinguino(String nombre, String especie, String habitat) {
        super(nombre, especie, habitat);
    }
    public void migrar(){
        System.out.println("El pinguino esta migrando ");
    }
    @Override
    public void volar() {
    }

    @Override
    public void nadar() {
        System.out.println("El pinguino esta nadando");
    }

    @Override
    public void protejerFrio() {
        System.out.println("El pinguino se proteje del viento");
    }

    @Override
    public void protejerViento() {
        System.out.println("El pinguino se proteje del frio");
    }

    @Override
    public void caminar() {
        System.out.println("El pinguino esta caminando");
    }

    @Override
    public void correr() {
        System.out.println("El pinguino esta corriendo");
    }

    @Override
    public void saltar() {
    }

    @Override
    public void sujetar() {
        System.out.println("El pinguino esta sujetando un huevo");
    }
    
}
