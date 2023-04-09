package ex6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ListaOrdenadaTest {

    ListaOrdenada ordena = new ListaOrdenada();

    @Test
    void testListaOrdenadaSemOrdem() {

        ArrayList<Double> listinha = new ArrayList<>();
        listinha.add(2D);
        listinha.add(3D);
        listinha.add(1D);

        assertEquals(false, ordena.listaOrdenada(listinha));

    }  
    
    @Test
    void testListaOrdenadaCrescente() {

        ArrayList<Double> listinha = new ArrayList<>();
        listinha.add(1D);
        listinha.add(2D);
        listinha.add(3D);

        assertEquals(true, ordena.listaOrdenada(listinha));

    }

    
    @Test
    void testListaOrdenadaDecrescente() {

        ArrayList<Double> listinha = new ArrayList<>();
        listinha.add(3D);
        listinha.add(2D);
        listinha.add(1D);

        assertEquals(true, ordena.listaOrdenada(listinha));

    }
    
    @Test
    void testListaOrdenadaValorMaximoEValorMinimo() {

        ArrayList<Double> listinha = new ArrayList<>();
        listinha.add(Double.MIN_VALUE);
        listinha.add(Double.MAX_VALUE);

        assertEquals(true, ordena.listaOrdenada(listinha));

    }

    



}
