public class CuentasAhorros extends ChequesAhorros{
    
    public int fechaVencimiento;
    public double interesMensual;
    public int retiro;

    public CuentasAhorros(int fechaVencimiento, double interesMensual, int retiro, String numCuenta, String nomCliente, int saldo) {
        super(numCuenta, nomCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.interesMensual = interesMensual;
        this.retiro = retiro;
    }
    
    public void retirar(){
        if (retiro>saldo) {
            System.out.println("esta cuenta tiene saldo insuficiente");
        }else{
            System.out.println("Retirando cantidad");
            saldo=saldo-retiro;
        }
    }
    
    public void comisionEmision(){
        if (retiro>saldo) {
            System.out.println("se le cargara una comision por uso de cheque sin fondo");
            saldo=(int)(saldo+(saldo*0.16));
        }else{
            System.out.println("");
        }
        
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    @Override
    public String toString() {
        return super.toString()+ " \nfecha de vencimiento: " + fechaVencimiento + " \ninteresMensual: " + interesMensual;
    }
    
}
