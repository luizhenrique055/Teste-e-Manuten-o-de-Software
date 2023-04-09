package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Class.Casa;

public class CasaTest {
    @Test
    public void testValorTotal() {
        Casa casa1 = new Casa(1000, 200);
        assertEquals(1200, casa1.valorTotal(), 0.001);
        
        Casa casa2 = new Casa(1500, -100);
        assertEquals(1500, casa2.valorTotal(), 0.001);
        
        Casa casa3 = new Casa(2000, 0);
        assertEquals(2000, casa3.valorTotal(), 0.001);
    }
}
