
public class ChequesAhorros {
    private String numCuenta;
    private String nomCliente;
    protected int saldo;
    int retiro;

    public ChequesAhorros(String numCuenta, String nomCliente, int saldo) {
        this.numCuenta = numCuenta;
        this.nomCliente = nomCliente;
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "numCuenta: " + numCuenta + " \nnomCliente: " + nomCliente + " \nsaldo: " + saldo;
    }
    
    public void consultarDatos(){
        System.out.println("consultando datos: "+"numCuenta: " + numCuenta + " \nnomCliente: " + nomCliente + " \nsaldo: " + saldo);
    }
    
    public void pagar(){
        if (retiro>saldo) {
            System.out.println("este cheque tiene saldo insuficiente");
        }else{
            System.out.println("pagando cantidad");
            saldo=saldo-retiro;
        }
    }
    
    public void comsionUso(){
        System.out.println("La comision de uso sera de: "+(retiro*0.16));
    }
    
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
}
