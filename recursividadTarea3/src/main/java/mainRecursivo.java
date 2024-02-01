import java.util.Scanner;
public class mainRecursivo {
    public static void main(String args[]) {
        
        //objetos
        Scanner scanner = new Scanner(System.in);
        Recursivo obj1 = new Recursivo();
        
        //procesos 
        System.out.println("Ingrese un numero para ver su factorial: ");
        obj1.setEleccion(scanner.nextInt());
        System.out.println(obj1.factorial());
    }
}
