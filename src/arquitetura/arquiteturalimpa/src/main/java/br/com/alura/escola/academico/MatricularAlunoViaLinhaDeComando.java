package br.com.alura.escola.academico;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.shared.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunoEmMemoria;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano";
        String cpf = "123.456.123-00";
        String email ="fulano@gmail.com";

        MatricularAlunoDto dto = new MatricularAlunoDto(
                nome, cpf, email
        );

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno matricular = new MatricularAluno(
                new RepositorioDeAlunoEmMemoria(), publicador);
        matricular.executa(dto);
    }
}
