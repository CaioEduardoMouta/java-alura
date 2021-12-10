package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Email;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveriaCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("12345678900"));
    }

}
