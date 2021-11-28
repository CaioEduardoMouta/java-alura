package arquitetura.solid.service;

import arquitetura.solid.ValidacaoException;
import arquitetura.solid.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriocidadaeEntreReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesseUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalor deve ser no minimo 6 meses");
        }
    }
}