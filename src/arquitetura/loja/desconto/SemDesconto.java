package arquitetura.loja.desconto;

import java.math.BigDecimal;

import arquitetura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
}
