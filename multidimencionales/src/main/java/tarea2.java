import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        int numeros [][] = new int [3][2];
        int entrada=0;
        int numNeg=0;
        
        System.out.println("Ingrese los numeros de la matriz...");
        System.out.println("-----------------------------------");
        
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros[x].length; y++) {
                System.out.println("ingrese el valor: ");
                entrada=scaner.nextInt();
                numeros[x][y]=entrada;
                if (entrada<0) {
                    numNeg++;
                }
            }
        } 
        System.out.println("---------------------------------");
        System.out.println("Total de numeros negativos: "+numNeg);
    }
}
