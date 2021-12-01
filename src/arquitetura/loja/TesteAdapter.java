package arquitetura.loja;

import java.math.BigDecimal;

import arquitetura.loja.http.JavaHttpCliente;
import arquitetura.loja.orcamento.Orcamento;
import arquitetura.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN,1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(orcamento);
	}
}
