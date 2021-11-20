package heranca.br.com.safra.banco.test;

import heranca.br.com.safra.banco.modelo.Conta;
import heranca.br.com.safra.banco.modelo.ContaCorrente;
import heranca.br.com.safra.banco.modelo.GuardadorDeContas;

public class Teste {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,11);
        guardador.adiciona(cc2);
    }
}
