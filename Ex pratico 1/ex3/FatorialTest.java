package ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class FatorialTest {

    Fatorial fac = new Fatorial();

    @Test
    void valorMinimo(){
        assertEquals(1, fac.calcularFatorial(Integer.MIN_VALUE));
    }
 
    @Test
    void testFatorialCorreto(){
        assertEquals(120, fac.calcularFatorial(5));
    }

    @Test
    void testFatorialIncorreto(){
        assertNotEquals(119, fac.calcularFatorial(5));
        assertNotEquals(121, fac.calcularFatorial(5));
    }


    @Test
    void testFatorialValoresEntradaInvalidos() {

        assertEquals(1, fac.calcularFatorial(1));
        assertEquals(1, fac.calcularFatorial(0));
        assertEquals(1, fac.calcularFatorial(-1));

    }



}
