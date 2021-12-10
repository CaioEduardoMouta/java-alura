package br.com.alura.escola.dominio.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(numero == null ||
                !numero.matches("\\d{9}\\.\\d{8}\\.")){
            throw new IllegalArgumentException("Numero Invalido");
        }
        if(ddd == null ||
                !ddd.matches("\\d{2}\\.")){
            throw new IllegalArgumentException("ddd Invalido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
