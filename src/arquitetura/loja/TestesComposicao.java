package arquitetura.loja;


import java.math.BigDecimal;

import arquitetura.loja.orcamento.ItemOrcamento;
import arquitetura.loja.orcamento.Orcamento;
import arquitetura.loja.orcamento.OrcamentoProxy;

public class TestesComposicao {
	
	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}

}
