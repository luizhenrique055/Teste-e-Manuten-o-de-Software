package ex4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    void testConveterTemperaturaValidaPositiva() {
        assertEquals(32, conversor.converteTemperatura(0));
    }

    @Test
    void testConveterTemperaturaValidaNegativa() {
        assertEquals(30.2, conversor.converteTemperatura(-1));
    }

    @Test
    void testConverterTemperaturaErrada() {
        assertNotEquals(121, conversor.converteTemperatura(50));
        assertNotEquals(123, conversor.converteTemperatura(50));
    }

    @Test
    void testConverterTemperaturaMaximaEMinima() {
        assertEquals(3.8654705966E9, conversor.converteTemperatura(Integer.MAX_VALUE));
        assertEquals(-3.8654705344E9, conversor.converteTemperatura(Integer.MIN_VALUE));
    }

}
