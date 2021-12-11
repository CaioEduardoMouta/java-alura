package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.gamificacao.dominio.CPF;

public class AlunoNaoEncotrado extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public AlunoNaoEncotrado(CPF cpf) {
        super("Aluno não encontrado" + cpf.getNumero());
    }
}
