public class Futbolista extends Deportista{
    String posicion;
    int hrsEntrenamiento;

    public Futbolista(String posicion, int hrsEntrenamiento, String nombre, String apellidos, String nacionalidad) {
        super(nombre, apellidos, nacionalidad);
        this.posicion = posicion;
        this.hrsEntrenamiento = hrsEntrenamiento;
    }
    public void ejercitarse(){
        
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getHrsEntrenamiento() {
        return hrsEntrenamiento;
    }

    public void setHrsEntrenamiento(int hrsEntrenamiento) {
        this.hrsEntrenamiento = hrsEntrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
