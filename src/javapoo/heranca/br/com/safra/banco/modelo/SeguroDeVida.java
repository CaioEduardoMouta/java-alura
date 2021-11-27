package javapoo.heranca.br.com.safra.banco.modelo;

import javapoo.heranca.br.com.safra.banco.test.Tributavel;

public class SeguroDeVida implements Tributavel {


    @Override
    public double getValorImposto() {
        return 42;
    }
}
