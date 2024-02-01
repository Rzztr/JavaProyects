public class Recursiva {
    int nNumero =0;
    int num=1;
    
    public int fibonacci(){
        for (int i = 0; i < 10; i++) {
            System.out.println(nNumero);
            int sucesor = nNumero+num;
            nNumero=num;
            num=sucesor;
        }
        return num;
    }
}
