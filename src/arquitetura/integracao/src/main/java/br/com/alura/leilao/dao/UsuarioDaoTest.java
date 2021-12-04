package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Usuario;
import br.com.alura.leilao.util.JPAUtil;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import static org.aspectj.bridge.MessageUtil.fail;

public class UsuarioDaoTest {

    private UsuarioDao dao;
    private EntityManager em;

    @BeforeEach
    public void beforeEach() {
        this.em = JPAUtil.getEntityManager();
        this.dao = new UsuarioDao(em);
        em.getTransaction().begin();
    }

    @AfterEach
    public void afterEach() {
        em.getTransaction().rollback();

    }

    //private EntityManager em;

    @Test
    void deveriaEncontrarUsuarioCadastrado() {
        Usuario usuario = new Usuario("fulano","fulano@email.com","122345");

        em.persist(usuario);


        Usuario encontrado = this.dao.buscarPorUsername(usuario.getNome());
        Assert.assertNotNull(encontrado);
    }

    @Test
    void naoDeveriaEncontrarUsuarioNaoCadastrado() {
        Usuario usuario = new Usuario("fulano","fulano@email.com","122345");
        em.persist(usuario);
        Assert.assertThrows(NoResultException.class, () -> this.dao.buscarPorUsername("beltrano"));
    }

    @Test
    void deveriaRemoverUmUsuario() {
        Usuario usuario = criarUsuario();
        dao.deletar(usuario);

        Assert.assertThrows(NoResultException.class, () -> this.dao.buscarPorUsername(usuario.getNome()));
    }
    private Usuario criarUsuario() {
        Usuario usuario = new Usuario("Fulano","fulano@sicrano.com","21212121");
        em.persist(usuario);
        return usuario;
    }
}
