public class EstufaGas extends Estufa{

    public EstufaGas(int NoParrillas, String nombre, String marca, double precio) {
        super(NoParrillas, nombre, marca, precio);
    }
    @Override
    public void funcionamiento(){
        System.out.println("Esta estufa produce calor mediante la combustion de gas");
    }
    public void hornear(int grados){
        System.out.println("La estufa electica "+marca+" hornea a "+ grados +" centigrados");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
