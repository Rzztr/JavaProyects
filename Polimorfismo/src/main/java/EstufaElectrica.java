public class EstufaElectrica extends Estufa{
    int potenciaElectrica;

    public EstufaElectrica(int potenciaElectrica, int NoParrillas, String nombre, String marca, double precio) {
        super(NoParrillas, nombre, marca, precio);
        this.potenciaElectrica = potenciaElectrica;
    }
    @Override
    public void funcionamiento(){
        System.out.println("Esta estufa funciona mendiante corriente electrica");
    }
    public void hornear(int grados){
        System.out.println("La estufa electica "+marca+" hornea a "+ grados +" centigrados");
    }

    @Override
    public String toString() {
        return super.toString()+ " potenciaElectrica: " + potenciaElectrica;
    }
}
