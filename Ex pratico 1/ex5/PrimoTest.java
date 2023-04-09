package ex5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimoTest {

    Primo primo = new Primo();

    @Test
    void valorLimite() {
        assertEquals(true, primo.ePrimo(Integer.MAX_VALUE));
        assertEquals(false, primo.ePrimo(Integer.MIN_VALUE));
    }

    @Test
    void testEntradaInvalida() {

        assertEquals(false, primo.ePrimo(1));
        assertEquals(false, primo.ePrimo(0));
        assertEquals(false, primo.ePrimo(-1));

    }

    @Test
    void testNaoEPrimo() {

        assertEquals(false, primo.ePrimo(10));
    }

    @Test
    void testEPrimo() {

        assertEquals(true, primo.ePrimo(5));

    }

}
