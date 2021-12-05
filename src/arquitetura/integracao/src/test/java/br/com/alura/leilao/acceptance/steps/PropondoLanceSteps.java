package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.math.BigDecimal;

public class PropondoLanceSteps {

    private Lance lance;
    private Leilao leilao;
    private Lance lance10;
    private Lance lance15;

    @Dado("um lance valido")
    public void dado_um_lance_valido() {
        Usuario usuario = new Usuario("fulano");
        lance = new Lance(usuario, BigDecimal.TEN);
    }

    @Quando("propoe o leilao")
    public void quando_propoe_o_lance() {
        leilao = new Leilao("Tablet XPTO");
        leilao.propoe(lance);
    }
    @Entao("o lance aceito")
    public void entao_o_lance_eh_aceito() {

        Assert.assertEquals(1,leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

    @Dado("varios lances validos")
    public void varios_lances_validos() {
        Usuario usuario1 = new Usuario("fulano");
        lance10 = new Lance(usuario1, BigDecimal.TEN);
        Usuario usuario2 = new Usuario("beltrano");
        lance15 = new Lance(usuario2, new BigDecimal("15.0"));
    }

    @Quando("propoe o lance")
    public void propoe_o_lance() {
        leilao = new Leilao("Tablet XPTO");
        leilao.propoe(lance);
    }
    @Entao("os lances sao aceitos")
    public void os_lances_sao_aceitos() {

    }

}
