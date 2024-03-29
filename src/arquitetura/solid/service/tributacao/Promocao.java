package arquitetura.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste, ReajusteTributavel{

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
