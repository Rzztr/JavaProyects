public class mainDeportistas {
    public static void main(String[] args) {
        Futbolista d1 = new Futbolista("Delantero", 8, "jose", "Mendes", "Haitiano");
        Nadador d2 = new Nadador(true, "Marcos", "Beltran", "Americano");
        
        //Deportista uno
        d1.ejercitarse();
        
        //Deportista dos
        System.out.println(d2.toString());
        d2.setNombre("Juan");
        d2.setApellidos("Gomez");
        d2.setNacionalidad("Mexicano");
        System.out.println(d2.toString());
        d2.ejercitarse();
    }
    
}
