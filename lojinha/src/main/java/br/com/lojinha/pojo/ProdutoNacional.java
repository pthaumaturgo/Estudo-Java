package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoNacional extends Produto{
    public ProdutoNacional(String marca1, Tamanho tamanho1) {
        super(marca1, tamanho1);
    }

    private double ImpostoNacional;

    public double getImpostoNacional() {
        return this.ImpostoNacional;
    }

    public void setImpostoNacional(double NovoImpostoNacional) {
        this.ImpostoNacional = NovoImpostoNacional;
    }
}
