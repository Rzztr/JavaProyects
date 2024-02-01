import java.util.Date;
public class main {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("carlos", 5000);
        Cliente cliente1 = new  Cliente(new Date(), true);
        Cliente cliente2 = new Cliente(new Date(), true, "Karla", 'F', 23, "Madero #234");
        
        //Empelado 1
        empleado1.setEdad(23);
        empleado1.setGenero('M');
        empleado1.setDireccion("Morelos #124");
        
        //cliente 1
        cliente1.setNombre("Jose");
        cliente1.setEdad(24);
        cliente1.setGenero('M');
        cliente1.setDireccion("Hidalgo #789");
        
        //cliente 2
        System.out.println(cliente2.toString());
        
        
        
        
    }
}
