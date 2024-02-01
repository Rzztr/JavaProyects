public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected String habitat;

    public Animal(String nombre, String especie, String habitat) {
        this.nombre = nombre;
        this.especie = especie;
        this.habitat = habitat;
    }
    public void alimentarse(){
        System.out.println(nombre+" se esta alimentando");
    }
    public void reproducir(){
        System.out.println("El animal se esta cojiendo a otro");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\n especie: " + especie + ", \n habitat: " + habitat;
    }
}
