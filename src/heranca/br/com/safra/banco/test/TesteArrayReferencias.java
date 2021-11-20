package heranca.br.com.safra.banco.test;

import heranca.br.com.safra.banco.modelo.Cliente;
import heranca.br.com.safra.banco.modelo.Conta;
import heranca.br.com.safra.banco.modelo.ContaCorrente;
import heranca.br.com.safra.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {


        Object[] referencias = new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22,11);

        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(12,33);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        Object referenciaGenerica = referencias[1];



        ContaPoupanca ref = (ContaPoupanca) referencias[1];

        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
   }
}
