public class Recursivo {
    int suma=0;
    int limite;

    public Recursivo(int limite) {
        this.limite = limite;
    }
    
    
    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    //metodo
    public int sumas(){
        for (int i = 1; i <= limite; i++) {
           suma=suma+i;
        }
        System.out.println("Suma total: "+suma);
        return 0;
    }
    
//    int[] arreglo1;
//    
//    int[] arreglo2 = new int[10];
    
    
    int[] numeros = {10,2,46,12974};
    
    int primEle = numeros[0];
    int segEle = numeros[2];
    
    


    
}
