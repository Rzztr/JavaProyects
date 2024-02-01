import java.util.Scanner;
public class ejemploArreglos {
    public static void main(String args[]){        
        
        Scanner scanner = new Scanner(System.in);
        int entrada;
        boolean loop = true;
        
        int edades [];
        
        edades = new int [5];
        
        edades[0]=15;
        edades[1]=20;
//        System.out.println("el valor del indice 1: "+edades[1]);
        
        int numeros [] = {1,2,3,4,5};
//        System.out.println(numeros[0]);
//        System.out.println(numeros[4]);

        Persona [] personas = new  Persona[4];
        
        personas [0] = new Persona("Jose", "lopez", 18); 
        personas [1] = new Persona("Maria", "medina", 19);
        
        System.out.println(personas[1]);
        System.out.println(personas[0]);
        
        String nombres [] = {"jose", "juan ","josefina"};
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        int numeros1 [];
        
    }
}

