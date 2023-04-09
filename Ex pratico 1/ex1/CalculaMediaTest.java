package ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CalculaMediaTest {

    Media media = new Media();

    @Test
    void testArrayVazio() {

        ArrayList<Integer> arrayInteiros = new ArrayList<>();
        assertTrue(arrayInteiros.isEmpty());
        
    }

    @Test
    void testValorMaximo() {
        ArrayList<Integer> arrayInteiros = new ArrayList<>();
        arrayInteiros.add(Integer.MAX_VALUE);

        assertEquals(Integer.MAX_VALUE, media.calculaMedia(arrayInteiros));
    }

    @Test
    void testMediaPositiva() {

        ArrayList<Integer> arrayInteiros = new ArrayList<>();
        arrayInteiros.add(2);
        arrayInteiros.add(2);
        arrayInteiros.add(2);

        assertEquals(2, media.calculaMedia(arrayInteiros));

    }

    @Test
    void testMediaNegativa() {

        ArrayList<Integer> arrayInteiros = new ArrayList<>();
        arrayInteiros.add(-2);
        arrayInteiros.add(-2);
        arrayInteiros.add(-2);
        assertEquals(-2, media.calculaMedia(arrayInteiros));

    }

}
