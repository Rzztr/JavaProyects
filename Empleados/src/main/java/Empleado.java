public class Empleado {
    private String nombre= "";
    private String apellido= "";
    private int edad= 0;
    private double salario= 0;
    
    public Empleado (String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double Aumento(){
        if (edad>40&&salario<3000) {
            salario+= 1000;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", salario con aumento: " + salario;
    }
    
    
}
