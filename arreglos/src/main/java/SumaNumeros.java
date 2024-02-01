import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int suma=0;
        var promedio=0;
        int numIndex;
        int index=0;
        
        
        System.out.println("De que tamaño quiere que sea el vector?: ");
        numIndex=scanner.nextInt();
        int [] numeros1 = new int[numIndex];
            
            for (int i = 0; i < numIndex; i++) {
                System.out.println("Ingrese el contenido: "+i);
                index = scanner.nextInt();
                numeros1[i]=index;
            }
            
            System.out.println("-----------Contenido del arreglo-------------");
            
            for (int j = 0; j < numeros1.length; j++) {
                System.out.println("Numero de arreglo: "+ numeros1[j]);
                suma +=numeros1[j];
            }
            System.out.println("---------------");
            promedio=suma/numeros1.length;
            System.out.println("La suma de los numeros es: "+suma);
            System.out.println("El promedio es: "+promedio);
    
    }
}
