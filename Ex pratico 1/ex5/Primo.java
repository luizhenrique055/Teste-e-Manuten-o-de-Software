package ex5;

public class Primo {
    
    public boolean ePrimo(int numero) {

        if(numero <= 1){
            return false;
        }

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}
