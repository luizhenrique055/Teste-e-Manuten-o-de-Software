package ex3;

public class Fatorial {

    public int calcularFatorial(int x) {

        if (x <= 0) {
            return 1;
        }

        if (x == 0) {
            return 1;
        }

        return x * calcularFatorial(x - 1);
        
    }

}
