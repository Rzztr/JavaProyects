public class Recursividad {
    int suma = 0;
    public int numeros(int num1){
        
        if (num1<=5) {
            System.out.print(num1+ " ");
            if (num1>3) {
                suma = suma+num1;
            }
            numeros(num1+1); //sumara un numero hasta que se termine el metodo
        } 
        return suma;
    }
    
}
