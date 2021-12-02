package arquitetura.loja;

import arquitetura.loja.imposto.CalculadoraDeImpostos;
import arquitetura.loja.imposto.ICMS;
import arquitetura.loja.imposto.ISS;
import arquitetura.loja.orcamento.ItemOrcamento;
import arquitetura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
    	Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

       CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
       System.out.println(calculadora.calcular(primeiro, new ICMS(new ISS(null))));
       System.out.println(calculadora.calcular(segundo, new ICMS(new ISS(null))));

    }
}
