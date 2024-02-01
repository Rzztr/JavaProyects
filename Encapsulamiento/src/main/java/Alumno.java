public class Alumno {
    String nombre;
    int edad;
    boolean aprobado;
    
    //constructor 
    
    public Alumno (String nombre, int edad, boolean aprobado){
        this.nombre=nombre;
        this.edad=edad;
        this.aprobado=aprobado;
    }
    //get 
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "Alumno: " + "nombre: " + nombre + ", edad: " + edad + ", aprobado: " + aprobado;
    }
    
}

    

