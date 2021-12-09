package br.com.alura.escola;

import br.com.alura.escola.aluno.Email;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emialinvalido"));
    }

}
