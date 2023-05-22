import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    @Test
    void testAdicionarLembrete() {
        Sistema sistema = new Sistema();
        assertEquals(0, sistema.tamanhoArmazenamento());

        Lembrete lembrete = new Lembrete("Comprar coisa", "Descrição do lembrete", LocalDate.of(2099, 1, 1));
        sistema.adicionarLembrete(lembrete);
        assertEquals(1, sistema.tamanhoArmazenamento());
    }

    @Test
    void testRemocaoLembrete() {
        Sistema sistema = new Sistema();

        Lembrete lembrete = new Lembrete("Comprar coisa", "vou comprar um trem", LocalDate.of(2099, 1, 1));
        Lembrete lembrete2 = new Lembrete("Vaca vaquinha", "muu", LocalDate.of(2088, 1, 1));
        Lembrete lembrete3 = new Lembrete("Boi boizao", "MUU", LocalDate.of(2084, 1, 1));

        sistema.adicionarLembrete(lembrete);
        sistema.adicionarLembrete(lembrete2);
        sistema.adicionarLembrete(lembrete3);

        assertEquals(3, sistema.tamanhoArmazenamento());

        LocalDate data = LocalDate.of(2099, 1, 1);
        sistema.remocaoLembrete(data, 1);

        assertEquals(2, sistema.tamanhoArmazenamento());

    }
}