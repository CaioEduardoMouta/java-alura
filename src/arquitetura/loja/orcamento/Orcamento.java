package arquitetura.loja.orcamento;

import java.math.BigDecimal;

import arquitetura.loja.orcamento.situacao.EmAnalise;
import arquitetura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private EmAnalise situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }
    
    public void aplicarDescontoExtra() {
    	BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
	this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    
    public void aprovar() {
    	this.situacao.aprovar(this);
    }
    
    public void reprovar() {
    	this.situacao.reprovar(this);
    }
    
    public void finalizar() {
    	this.situacao.finalizar(this);
    }
    
    
    public BigDecimal getValor() {
        return valor;
    }


	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public EmAnalise getSituacao() {
		return situacao;
	}
	
	public void setSituacao(EmAnalise situacao) {
		this.situacao = situacao;
	}
	

	
}
