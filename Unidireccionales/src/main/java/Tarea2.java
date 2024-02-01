import java.util.Scanner;
public class Tarea2 {
    public static void main(String args[]) {
        
        int numIndex = 0;
        int index =0;
        int par=0;
        int non=0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("De que tamaño sera el vector?: ");
        numIndex=scanner.nextInt();
        int [] numeros2 = new int[numIndex];
        
        for (int i = 0; i < numIndex; i++) {
            System.out.println("Ingrese el contenido "+i);
            index = scanner.nextInt();
            numeros2[i]=index;
        }
        
        System.out.println("----------Contenido arreglo----------");
        for (int j = 0; j < numeros2.length; j++) {
            System.out.println("Numero de arreglo: "+ numeros2[j]);
        }
        for (int k = 0; k < numeros2.length; k++) {
            if (numeros2[k]%2==0) {
                par++;
            }else{
                non++;
            }
        }
        System.out.println("-----------------");
        System.out.println("El numero de pares es de: "+par);
        System.out.println("El numero de nones es de: "+non);
        
    }
}
