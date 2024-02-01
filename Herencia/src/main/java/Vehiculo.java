public class Vehiculo {
    
    private String modelo;
    private String marca;
    private String color;
    
    
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public Vehiculo(String modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "modelo: " + modelo + ", marca: " + marca + ", color: " + color;
    }
    
    
}
