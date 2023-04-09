package ex6;

import java.util.ArrayList;

public class ListaOrdenada {

    public boolean listaOrdenada(ArrayList<Double> lista) {

        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i+i)) {
                crescente = false;
            }
            if (lista.get(i) < lista.get(i+1)) {
                decrescente = false;
            }
        }

        return crescente || decrescente;

    }

}
