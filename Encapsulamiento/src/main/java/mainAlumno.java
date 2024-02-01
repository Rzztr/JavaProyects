public class mainAlumno {
    public static void main(String[] args) {
        Alumno a1= new Alumno("Ricardo", 18, true);
        Alumno a2 = new Alumno("Jose", 19, true);
    
//        System.out.println("Nombre del alumno "+a1.getNombre());
//        a1.setNombre("Christopher");
//        System.out.println("Nombre alumno: "+a1.getNombre());
        System.out.println(a2.toString());
        System.out.println(a1.toString());
        a2.setNombre("Carlos");
        a2.setEdad(25);
        System.out.println(a2);
    }
    
}
