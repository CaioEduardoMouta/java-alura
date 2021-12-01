package arquitetura.loja.imposto;

import arquitetura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends TipoImposto{
	
    public ICMS(TipoImposto outro) {
		super(outro);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
