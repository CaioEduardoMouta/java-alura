package arquitetura.loja.desconto;

import java.math.BigDecimal;

import arquitetura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
		
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
		
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getQuantidadeItens() > 5; 
	}
	
}
