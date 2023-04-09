package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Class.Apartamento;
import Class.Casa;
import Class.Proprietario;

public class TestsProprietarioTest {

    @Test
    public void testAdicionarImovel() {
        Proprietario proprietario = new Proprietario();
        
        Apartamento apartamento1 = new Apartamento(1000, 200);
        Casa casa1 = new Casa(1500, 300);

        proprietario.adicionarImovel(apartamento1);
        assertEquals(1, proprietario.getQuantidadeImoveis());


        proprietario.adicionarImovel(casa1);
        assertEquals(2, proprietario.getQuantidadeImoveis());
    }
    
    @Test
    public void testPrecoTotalAlugueis() {
        Proprietario proprietario = new Proprietario();
        
        Apartamento apartamento1 = new Apartamento(1000, 200);
        Casa casa1 = new Casa(1500, 300);

        proprietario.adicionarImovel(apartamento1);
        proprietario.adicionarImovel(casa1);
        
        assertEquals(2500, proprietario.precoTotalAlugueis(), 0.001);
    }

}
