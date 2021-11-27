package javapoo.heranca.br.com.safra.banco.modelo;

import javapoo.heranca.br.com.safra.banco.test.Tributavel;

public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }


}
