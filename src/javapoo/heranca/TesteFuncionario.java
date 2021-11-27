package javapoo.heranca;

import javapoo.heranca.Funcionario;


public class TesteFuncionario {

    public static void main(String[] args) {


        Funcionario Caio = new Gerente();
        Caio.setNome("Caio Mouta");
        Caio.setCpf("222111333-99");
        Caio.setSalario(2400.00);

        System.out.println(Caio.getNome());
        System.out.println(Caio.getBonificacao());


    }
}
