package arquitetura.loja;

import java.math.BigDecimal;

import arquitetura.loja.http.JavaHttpCliente;
import arquitetura.loja.orcamento.ItemOrcamento;
import arquitetura.loja.orcamento.Orcamento;
import arquitetura.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		
		Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(BigDecimal.TEN,1));
		primeiro.aprovar();
		primeiro.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(primeiro);
	}
}
