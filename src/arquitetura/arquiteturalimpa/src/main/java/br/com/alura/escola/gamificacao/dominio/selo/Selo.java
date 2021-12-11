package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.gamificacao.dominio.CPF;

public class Selo {

    private CPF cpfDoAluno;
    private String nome;

    public Selo (CPF cpfDoAluno, String nome) {
        this.cpfDoAluno = cpfDoAluno;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
