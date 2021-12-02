package arquitetura.loja.orcamento;

import java.util.Map;

import arquitetura.loja.DomainException;
import arquitetura.loja.http.HttpAdapter; 


public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}


	public void registrar(Orcamento orcamento) {
		if(orcamento.isFinalizado()) {
			throw new DomainException("Oçamento não finalizado");
			
		}
		String url = "http://api.xyz/orcamento";
		Map<String, Object> dados = Map.of(
		            "valor", orcamento.getValor(),
		            "QuantidadesItens",orcamento.getQuantidadeItens()
		            );
		http.post(url,dados);
	}

}
