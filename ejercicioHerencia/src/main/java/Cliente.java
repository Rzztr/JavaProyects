import java.util.Date;
public class Cliente extends Persona{
    Date date = new Date();
    
    private int idCliente;
    private Date fecharegistro;
    private boolean vip;

    public Cliente(Date fecharegistro, boolean vip) {
        this.fecharegistro = fecharegistro;
        this.vip = vip;
    }

    public Cliente(Date fecharegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fecharegistro = fecharegistro;
        this.vip = vip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    
    @Override
    public String toString() {
        return super.toString() + "date: " + date + ", idCliente: " + idCliente + ", fecharegistro: " + fecharegistro + ", vip: " + vip;
    }
    
    
    
    
}
