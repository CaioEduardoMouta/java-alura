package arquitetura.loja.orcamento.situacao;

import arquitetura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	

	@Override
	public void finalizar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.setSituacao(new Finalizado());
	}
}
