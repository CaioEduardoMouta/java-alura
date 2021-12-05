package br.com.alura.leilao.lance;

import br.com.alura.leilao.PageObject;

public class LancesPage extends PageObject {

    private static final String URL_LANCES = "http://localhost:8080/leiloes/2";

    public LancesPage() {
        super(null);
        this.browser.navigate().to(URL_LANCES);
    }

    public boolean isPaginaAtual() {
        return browser.getCurrentUrl().contains(URL_LANCES);
    }
}
