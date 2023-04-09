package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Class.Apartamento;

public class ApartamentoTest {

    @Test
    public void testValorTotalValorCondominioValido() {

        Apartamento apartamento1 = new Apartamento(1000, 200);
        assertEquals(1200, apartamento1.valorTotal(), 0.001);
 
    }

    @Test
    public void testValorTotalValorCondominioIgual_A_0() {

        Apartamento apartamento3 = new Apartamento(2000, 0);
        assertEquals(2000, apartamento3.valorTotal(), 0.001);

    }
    
    @Test
    public void testValorTotalValorCondominioInvalido() {
       
        Apartamento apartamento2 = new Apartamento(1500, -100);
        assertEquals(1500, apartamento2.valorTotal(), 0.001);

    } 

    @Test
    public void testeValorAluguelInvalido() {
       
        Apartamento apartamento2 = new Apartamento(-32, 100);
        assertEquals(100, apartamento2.valorTotal(), 0.001);

    }
}
