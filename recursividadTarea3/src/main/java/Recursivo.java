
public class Recursivo {
    int resultado=1;
    int eleccion;

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    } 
    public int factorial(){
        for (int i = 1; i <= eleccion; i++) {
            resultado*=i;
        }
        return resultado;
    }
}

