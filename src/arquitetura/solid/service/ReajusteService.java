package arquitetura.solid.service;

import arquitetura.solid.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
       this.validacoes.forEach(v -> v.validar(funcionario, aumento));

//        ValidacaoPercentualReajuste validacaoPercentualReajuste = new ValidacaoPercentualReajuste();
//        ValidacaoPeriodicidadaeEntreReajuste validacaoPeriocidadaeEntreReajuste = new ValidacaoPeriodicidadaeEntreReajuste();
//
//        validacaoPercentualReajuste.validar(funcionario, aumento);
//        validacaoPeriocidadaeEntreReajuste(funcionario, aumento);

        BigDecimal salarioReajustado = funcionario.getSalary().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }


}
