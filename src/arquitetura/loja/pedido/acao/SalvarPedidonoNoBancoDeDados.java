package arquitetura.loja.pedido.acao;

import arquitetura.loja.pedido.Pedido;

public class SalvarPedidonoNoBancoDeDados implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}

}
