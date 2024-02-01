public class mainAnimales {
    public static void main(String[] args) {
        
        Oso oso1 =new Oso("oso Pardo", "Grizly", "Bosque");
        Mariposa marip1 = new Mariposa("mariposa", "monarca", "Bosque");
        Pinguino pingui1 = new Pinguino("Skipper", "Pinguino real", "Artico");
        Aguila aguila1 = new Aguila("Aguila", "Aguila real", "Montaña");
        
        //Metodos y caracteristicas oso
        System.out.println(oso1.toString());
        oso1.desgarrar();
        oso1.cazar();
        oso1.correr();
        oso1.hibernar();
        
        //Metodos y caracteristicas mariposa
        System.out.println(marip1.toString());
        marip1.alimentarse();
        marip1.migrar();
        marip1.sujetar();
        
        //Metodos y caracteristicas pinguino
        System.out.println(pingui1.toString());
        pingui1.caminar();
        pingui1.migrar();
        pingui1.protejerFrio();
        pingui1.protejerViento();
        
        //Metodos y caracteristicas aguila
        System.out.println(aguila1.toString());
        aguila1.caminar();
        aguila1.cazar();
        aguila1.planear();
    }
    
}
