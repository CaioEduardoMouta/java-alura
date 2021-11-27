package javapoo.heranca.br.com.safra.banco.especial;

import javapoo.heranca.br.com.safra.banco.modelo.Conta;

public class ContaEspecial extends Conta{

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
