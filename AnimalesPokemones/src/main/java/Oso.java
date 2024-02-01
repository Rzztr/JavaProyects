public class Oso extends Animal implements Colmillos,Garras, Patas {

    public Oso(String nombre, String especie, String habitat) {
        super(nombre, especie, habitat);
    }
    
    public void hibernar(){
        System.out.println("El oso comenzo a hibernar");
    }
    @Override
    public void morder() {
        System.out.println("El oso esta mordiendo un arbol");
    }

    @Override
    public void desgarrar() {
        System.out.println("El oso esta desgarrando una corteza ");
    }

    @Override
    public void cazar() {
        System.out.println("El oso esta cazando un animal");
    }

    @Override
    public void trepar() {
        System.out.println("El oso esta trepando un obstaculo");
    }

    @Override
    public void caminar() {
        System.out.println("El oso esta trepando");
    }

    @Override
    public void correr() {
        System.out.println("El oso esta corriendo atras de una presa ");
    }

    @Override
    public void saltar() {
        System.out.println("El oso esta saltando un obstaculo");
    }
    
    @Override
    public void sujetar() {
        System.out.println("El oso esta sujetando una rama ");
    }
    
}
