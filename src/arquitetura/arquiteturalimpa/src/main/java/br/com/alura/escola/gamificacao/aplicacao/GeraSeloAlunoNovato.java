package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;

public class GeraSeloAlunoNovato extends Ouvinte {
    @Override
    protected void reageAo(Evento evento) {

    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
