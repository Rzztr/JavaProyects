import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        ChequesAhorros c1 = new ChequesAhorros("REL04-777", "Ricardo Reyes", 10000);
        CuentasAhorros c2 = new CuentasAhorros(2023, 0.16, 0, "REY009", "Jose sanchez", 15000);
        Scanner entrada = new Scanner(System.in);
        
        int eleccion;
        int movimiento;
        var opSinTarjeta= "";
        boolean loop= true;
        
        while(loop==true){
            System.out.println("La cuenta a consultar es: \n1) ahorro \n2) cheque \n3) opreaciones sin targeta"); 
            eleccion=entrada.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Que hara con ella? \n1) pagar \n2) retirar \n3) enviar cheque \n4) revisar datos de tarjeta");
                    eleccion=entrada.nextInt();
                    switch (eleccion) {
                        case 1:
                            System.out.println("cuanto va a pagar?");
                            movimiento= entrada.nextInt();
                            c2.pagar();
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad a rertirar: ");
                            movimiento= entrada.nextInt();
                            c2.setRetiro(movimiento);
                            c2.retirar();
                            System.out.println("su nuevo saldo es de: "+c2.getSaldo());
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad que pagara su cheque: ");
                            movimiento= entrada.nextInt();
                            c2.setRetiro(movimiento);
                            c2.comisionEmision();
                            break;
                        case 4:
                            System.out.println("Los datos de su tarjeta son: "+c2.toString());
                            break;
                        default:
                            break;
                    }   break;
                case 2:
                    System.out.println("Que hara con ella? \n1) pagar \n2) retirar ");
                    eleccion=entrada.nextInt();
                    switch (eleccion) {
                        case 1:
                            System.out.println("cuanto va a pagar?");
                            movimiento= entrada.nextInt();
                            c1.pagar();
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad a rertirar: ");
                            movimiento= entrada.nextInt();
                            c1.setSaldo(movimiento);
                            System.out.println("su nuevo saldo es de: "+c1.toString());
                            break;
                        case 3:
                            System.out.println("Sus datos de cuenta son: " +c1.toString());
                            break;
                        default:
                            break;
                    }   break;
                default:
                    System.out.println("Adios!");
                    loop=false;
                    break;
            }
        }
    }
    
}
