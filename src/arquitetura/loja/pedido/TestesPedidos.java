package arquitetura.loja.pedido;

import java.math.BigDecimal;

import java.util.Arrays;

import arquitetura.loja.pedido.acao.EnviarEmail;
import arquitetura.loja.pedido.acao.LogDePedido;
import arquitetura.loja.pedido.acao.SalvarPedidonoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
		String cliente = "Caio";
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento,quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidonoNoBancoDeDados(),
				new EnviarEmail(),
				new SalvarPedidonoNoBancoDeDados(),
				new LogDePedido()
				));
		handler.execute(gerador);
	}
}
