package heranca.br.com.safra.banco.test.util;

import heranca.br.com.safra.banco.modelo.Conta;
import heranca.br.com.safra.banco.modelo.ContaCorrente;

import java.util.*;
/*
 ArrayList podemos definir o tipo dos elementos através de generics
java.util.ArrayList encapsula o uso do array e oferece vários métodos de mais alto nível

 */

public class TesteArrayList {

    public static void main(String[] args) {

        //generics
        /*
        Fazem parte da interface
        List
        Vector
        Collection
         */
        List<Conta> lista = new Vector<Conta>();


        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,21);
        lista.add(cc2);

        System.out.println(lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22,331);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
