public class ejemploMatricez {
    public static void main(String[] args) {
        int edades [][]=new int [3][2];
        
        edades [0][0] = 23;
        edades [0][1] = 30;
        edades [1][0] = 40;
        edades [1][1] = 50;
        edades [2][0] = 60;
        edades [2][1] = 70;
        
        System.out.println("el valor es de: "+edades[0][0]);
        
        
        
        Persona personas[][] = new Persona [1][2];
        personas [0][0] = new Persona("manolo cabeza huevo");
        personas [0][1] = new Persona("jose");
        
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz index: "+i+"-"+j+": "+personas[i][j]);
            }
        }
        
//        System.out.println("El nombre del primer indice es: " + personas[0][0]);

    }
}
