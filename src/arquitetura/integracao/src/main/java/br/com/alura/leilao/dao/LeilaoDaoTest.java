package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import br.com.alura.leilao.util.JPAUtil;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class LeilaoDaoTest {

    private LeilaoDao dao;
    private EntityManager em;

    @BeforeEach
    public void beforeEach() {
        this.em = JPAUtil.getEntityManager();
        this.dao = new LeilaoDao(em);
        em.getTransaction().begin();
    }

    @AfterEach
    public void afterEach() {
        em.getTransaction().rollback();

    }

    @Test
    void deveriaCdastrarUmLeilao() {
        Usuario usuario = criarUsuario();
        Leilao leilao = new Leilao("Mochila", new BigDecimal("70"), LocalDate.now());

        dao.salvar(leilao);

        Leilao salvo = dao.buscarPorId(leilao.getId());
        Assert.assertNotNull(salvo);
    }

    private Usuario criarUsuario() {
        Usuario usuario = new Usuario("Fulano","fulano@sicrano.com","21212121");
        em.persist(usuario);
        return usuario;
    }
}
