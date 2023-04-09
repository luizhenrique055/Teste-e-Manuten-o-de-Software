package ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ListaOrdenadaTest {

    ListaOrdenada listaOrdenada = new ListaOrdenada();

    @Test
    void testValorMaximoValorMinimo(){

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(Integer.MIN_VALUE);
        listInt.add(Integer.MAX_VALUE);

        assertEquals(true, listaOrdenada.estaOrdenada(listInt));

    }

    @Test
    void testListVazia() {

        ArrayList<Integer> listInt = new ArrayList<>();

        assertEquals(true, listInt.isEmpty());

    }

    @Test
    void testEstaOrdenada() {

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(-11);
        listInt.add(1);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);

        assertEquals(true, listaOrdenada.estaOrdenada(listInt));

    }

    @Test
    void naoEstaOrdenada() {

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(2);

        assertNotEquals(true, listaOrdenada.estaOrdenada(listInt));

    }

}
