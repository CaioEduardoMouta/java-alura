package javapoo.heranca.br.com.safra.banco.test;


import javapoo.heranca.br.com.safra.banco.modelo.CalculadorDeImposto;
import javapoo.heranca.br.com.safra.banco.modelo.ContaCorrente;
import javapoo.heranca.br.com.safra.banco.modelo.SeguroDeVida;

/**
 *
 *
 * @author Caio Mouta
 * @version 2.4
 */

public class TesteTributaveis {

    public static void main(String[] args) {
        /*
        Correto, o FQN (Full Qualified Name) é nome completo da
        classe, composto pelo nome do pacote e o nome da classe.

        FQN = Nome Pacote . Nome Simples da Classe
         */
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
