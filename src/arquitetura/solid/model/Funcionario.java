package arquitetura.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public  class Funcionario extends DadosPessoais{


    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;
    private Cargo cargo;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salary, DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
        super(nome, cpf, cargo, salary);
        this.dadosPessoais = dadosPessoais;
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }
}
