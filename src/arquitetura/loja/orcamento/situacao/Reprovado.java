package arquitetura.loja.orcamento.situacao;


import arquitetura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	
	
	public void finlizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
