package ex1;

import java.util.ArrayList;


public class Media {

    public double calculaMedia(ArrayList<Integer> listaInteiros) {

        double totalValorList = 0;
        int tamanhoList = listaInteiros.size();

        for (int i = 0; i < tamanhoList; i++) {

            totalValorList += listaInteiros.get(i);

        }

        return totalValorList / tamanhoList;

    }

}
