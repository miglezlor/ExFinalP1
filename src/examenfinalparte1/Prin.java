package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal objSumaDist = new Principal(10, 20);
        int operacion1 = objSumaDist.result;
        System.out.println("Es: " + operacion1);
        
        Principal objSumaIgu = new Principal(10);
        int operacion2 = objSumaIgu.result;
        System.out.println("Es: " + operacion2);
        
        Principal objMenos1 = new Principal();
        int operacion3 = objMenos1.result;
        System.out.println("Es: " + operacion3);
    }
}
