package javapoo.heranca.br.com.safra.banco.test;

import javapoo.heranca.br.com.safra.banco.modelo.Cliente;
import javapoo.heranca.br.com.safra.banco.modelo.ContaCorrente;
import javapoo.heranca.br.com.safra.banco.modelo.ContaPoupanca;


public class TesteObject {

    public static void main(String[] args) {

//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(33,11);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);

//        println(cp);
//        println(cliente);

    }

    static void println() {
    }

    static void prinln(int a){

    }

    static void println(boolean valor){

    }

    static void println(Object referencia){

    }
}
