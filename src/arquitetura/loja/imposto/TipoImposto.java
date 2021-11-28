package arquitetura.loja.imposto;

import arquitetura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
