package ex2;

import java.util.ArrayList;

public class ListaOrdenada {
    
    public boolean estaOrdenada(ArrayList<Integer> listaEntrada){

        boolean ordenacao = false;

        if(listaEntrada.stream().sorted().toList().equals(listaEntrada)){
            ordenacao = true;
        }

        return ordenacao;
    }

}
