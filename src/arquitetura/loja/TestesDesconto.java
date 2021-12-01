package arquitetura.loja;

import arquitetura.loja.desconto.CalculadoraDeDescontos;
import arquitetura.loja.orcamento.ItemOrcamento;
import arquitetura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {

    public static void main(String[] args) {
       Orcamento primeiro = new Orcamento();
       primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
       
       Orcamento segundo = new Orcamento();
       segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

       CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
       System.out.println(calculadora.calcular(primeiro));
       System.out.println(calculadora.calcular(segundo));
    }
}
