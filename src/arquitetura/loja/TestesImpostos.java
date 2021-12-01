package arquitetura.loja;

import arquitetura.loja.imposto.CalculadoraDeImpostos;
import arquitetura.loja.imposto.ICMS;
import arquitetura.loja.imposto.ISS;
import arquitetura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
       Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
       CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
       System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
