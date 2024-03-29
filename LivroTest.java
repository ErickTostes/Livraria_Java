package br.edu.infnet.ErickdaSilva;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LivroTest {

	@Test
    public void testGetStatusLivroRecente() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 2020, 29.90);
        assertEquals("Este livro é recente.", livro.getStatus());
    }

    @Test
    public void testGetStatusLivroAntigo() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 29.90);
        assertEquals("Este livro é antigo.", livro.getStatus());
    }
}
