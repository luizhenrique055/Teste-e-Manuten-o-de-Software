import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LembreteTest {

    @Test
    void testCompareToMenor() {
        Lembrete lembrete1 = new Lembrete("Comprar coisa", "Descrição do lembrete", LocalDate.of(2099, 1, 1));
        Lembrete lembrete2 = new Lembrete("Comprar um trem", "Descrição do lembrete", LocalDate.of(2100, 1, 1));
        // data do lembrete 1 e menor do que a do lembrete 2
        assertEquals(-1, lembrete1.compareTo(lembrete2));
    }

    @Test
    void testCompareToMaior() {
        Lembrete lembrete1 = new Lembrete("Comprar coisa", "Descrição do lembrete", LocalDate.of(2099, 1, 1));
        Lembrete lembrete2 = new Lembrete("Comprar um trem", "Descrição do lembrete", LocalDate.of(2100, 1, 1));
        // data do lembrete 1 e menor do que a do lembrete 2
        assertEquals(1, lembrete2.compareTo(lembrete1));
    }

    @Test
    void testCompareToIgual() {
        Lembrete lembrete1 = new Lembrete("Comprar coisa", "Descrição do lembrete", LocalDate.of(2099, 1, 1));
        Lembrete lembrete3 = new Lembrete("Comprar coisa", "Descrição do lembrete", LocalDate.of(2099, 1, 1));

        // data do lembrete 1 e igual lembrete 3
        assertEquals(0, lembrete3.compareTo(lembrete1));
    }

    @Test
    public void testStringInvalidaVazia() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Lembrete("", "Descrição do lembrete", LocalDate.of(2100, 1, 1));
        });
    }

    @Test
    public void testStringInvalidaSemNada() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Lembrete(" ", "Descrição do lembrete", LocalDate.of(2100, 1, 1));
        });
    }

    @Test
    public void testDataInvalida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Lembrete("Testete", "Testeste", LocalDate.of(2020, 1, 1));
        });
    }

    @Test
    public void testDescricaoInvalida() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Lembrete("Testete", null, LocalDate.of(2020, 1, 1));
        });
    }

    @Test
    public void testConstrutorValido() {
        LocalDate data = LocalDate.now().plusDays(1);
        Lembrete lembrete = new Lembrete("Comprar leite", "Comprar leite no supermercado", data);
        assertEquals("Comprar leite", lembrete.getNome());
        assertEquals("Comprar leite no supermercado", lembrete.getDescricao());
        assertEquals(data, lembrete.getData());
    }


}