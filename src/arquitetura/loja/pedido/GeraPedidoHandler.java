package arquitetura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import arquitetura.loja.orcamento.Orcamento;
import arquitetura.loja.pedido.acao.AcaoAposGerarPedido;


public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}



	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento (dados.getValorOrcamento(),dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		

		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
