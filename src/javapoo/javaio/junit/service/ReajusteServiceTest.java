package javapoo.javaio.junit.service;

import javapoo.javaio.junit.modelo.Desempenho;
import javapoo.javaio.junit.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    //Antes da chamada dos metodos ter esse inicializar
    @BeforeEach
    public void inicialziar(){
        System.out.println("Inicializar");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Caio ", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void finalizar(){
        System.out.println("Finalizar");
    }

    @BeforeAll
    public static void antesDeTodos() {
        System.out.println("Antes de Todos");
    }

    @AfterAll
    public static void depoisDeTodos() {
        System.out.println("Depois de todos");
    }

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForRuim() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }


    @Test
    public void reajusteDeveriaSerDeQuinzePorcento() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcento() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}