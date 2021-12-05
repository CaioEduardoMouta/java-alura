package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Que é possível recuperar elementos na página utilizando o método findElement();
Que é possível recuperar o código fonte da página utilizando o método getPageSource();
Que é possível recuperar o url atual do browser utilizando o método getCurrentUrl();
Que devemos utilizar o método sendKeys() para enviar textos para os inputs da página;
Que uma das maneiras de submeter um formulário é via método submit().
 */

public class LoginTest {

    LoginPage paginaDeLogin;

    @BeforeEach
    public void beforeEach() {
        this.paginaDeLogin = new LoginPage();
    }


    @AfterEach
    public void AfterEach() {
        this.paginaDeLogin.fechar();
    }
    @Test
    public void deveriaEfetuarLoginComDadosValidos() {

        paginaDeLogin.preencheFormularioDeLogin("fulano", "pass");
        paginaDeLogin.efetuaLogin();

        Assert.assertFalse(paginaDeLogin.isPaginaDeLogin());
        Assert.assertEquals("fulano",paginaDeLogin.getNomeUsuarioLogado());
    }

    @Test
    public void naoDeveriaLogarDadosInvalidos() {
      paginaDeLogin.preencheFormularioDeLogin("Invalido", "fvnss");
        paginaDeLogin.efetuaLogin();

        Assert.assertTrue(paginaDeLogin.isPaginaDeLoginComDadosInvalidos());
        Assert.assertNull(paginaDeLogin.getNomeUsuarioLogado());
        Assert.assertTrue(paginaDeLogin.contemTexto("Usuário e senha inválidos. "));


    }

    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
        paginaDeLogin.navegaParaPaginaDeLances();

        Assert.assertTrue(paginaDeLogin.isPaginaDeLogin());
        Assert.assertFalse(paginaDeLogin.contemTexto("Dados do Leilão"));

    }
}
