package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;

import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano";
        String cpf = "123.456.123-00";
        String email ="fulano@gmail.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunoEmMemoria());
        matricular.executa(
                new MatricularAlunoDto(nome,cpf,email));
    }
}
