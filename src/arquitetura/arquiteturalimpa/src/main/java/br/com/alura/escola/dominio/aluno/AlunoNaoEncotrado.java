package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoNaoEncotrado extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public AlunoNaoEncotrado(CPF cpf) {
        super("Aluno não encontrado" + cpf.getNumero());
    }
}
