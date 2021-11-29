package arquitetura.loja.orcamento.situacao;

import java.math.BigDecimal;

import arquitetura.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento{
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.setSituacao(new Finalizado());
	}

}
