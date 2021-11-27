package javapoo.heranca.br.com.safra.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.intValue());

        Double dRef = new Double(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number refNumbero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);

    }
}
