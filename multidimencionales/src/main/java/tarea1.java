import java.util.Scanner;
public class tarea1 {
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        int entrada;
       
       int matriz1 [][] = new int [3][3];

       matriz1 [0][0]=1;
       matriz1 [0][1]=2;
       matriz1 [0][2]=3;
       matriz1 [1][0]=4;
       matriz1 [1][1]=5;
       matriz1 [1][2]=6;
       matriz1 [2][0]=7;
       matriz1 [2][1]=8;
       matriz1 [2][2]=9;
       
       int suma = 0;
       
        System.out.println(matriz1.length);
//        System.out.println("la matriz inicial: ");
//        for (int i = 0; i < matriz1.length; i++) {
//            for (int j = 0; j < matriz1[i].length; j++) {
//                System.out.println(matriz1[i][j]);
//            }
//        }
//        System.out.println("--------------------------------------------");
//        
//        System.out.println("Ingrese un numero del 1 al 3: ");
//        entrada=scaner.nextInt();
//        
//        for (int x = 0; x < matriz1[entrada-1].length; x++) {
//            suma += matriz1[entrada-1][x];
//        }
//        System.out.println("La suma de la fila seleccionada es de: "+suma);
    }
}
