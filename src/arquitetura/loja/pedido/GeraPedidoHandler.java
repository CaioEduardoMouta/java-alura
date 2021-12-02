package arquitetura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import arquitetura.loja.orcamento.ItemOrcamento;
import arquitetura.loja.orcamento.Orcamento;
import arquitetura.loja.pedido.acao.AcaoAposGerarPedido;


public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}



	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento ();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		

		this.acoes.forEach(a -> a.executarAcao(pedido));
	}

}
