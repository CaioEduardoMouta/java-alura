package arquitetura.solid.service.promocao;

import arquitetura.solid.ValidacaoException;
import arquitetura.solid.model.Cargo;
import arquitetura.solid.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == funcionario.getCargo()) {
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }
}
