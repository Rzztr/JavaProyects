import java.util.Scanner;
public class mainRecursivo {
    public static void main(String args[]) {
        
        int entrada;
        
        //objetos
        Scanner scanner = new Scanner(System.in);
        Recursivo obj1 = new Recursivo(0);
        
        //prorcesos
        System.out.println("Ingrese un numero: ");
        entrada = scanner.nextInt();
        obj1.setLimite(entrada);
        obj1.sumas();
        
        
//        int[] numeros = {10,2,46,12974};
//    
//        int primEle = numeros[0];
//        int segEle = numeros[2];
//        System.out.println(primEle);

//        String[] diasSemana = {"Lunes", "Martes", "miercoles"};
//        
//        var meses = new String[]{"Enero", "Febrero", "Marzo"};
//        
//        System.out.println(diasSemana);
//        System.out.println(meses);
        
        
               
    }
}
