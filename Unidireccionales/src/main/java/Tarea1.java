
public class Tarea1 {

    public static void main(String args[]) {
        
        int numMayor=0;
        int [] numeros1 = {1,53,213,235,65};
        
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i]>numMayor) {
                numMayor=numeros1[i];
            }
        }
        System.out.println("El numero mayor del vector es: "+numMayor);
    }
}
