package br.com.alura.escola.academico;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.gamificacao.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(
                new CPF("123.123.123-00"),
                "Fulano da Silva",
                new Email("caio@email.com"));
    }
    @Test
    void deveriaPermitirAdicionarTelefone() {
        this.aluno.adicionarTelefone("11","9999999");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaAdicionar2Telefones() {
        this.aluno.adicionarTelefone("11","999999999");
        this.aluno.adicionarTelefone("11","888888888");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirAdicionar3Telefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("11", "999999999");
            this.aluno.adicionarTelefone("11", "888888888");
            this.aluno.adicionarTelefone("11", "922222222");
        });
    }

}
