package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{
    public ProdutoInternacional(String marca1, Tamanho tamanho1) {
        super(marca1, tamanho1);
    }

    private double taxaImportacao;

    public double getTaxaImportacao() {
        return this.taxaImportacao;
    }

    public void setTaxaImportacao(double novaTaxaImportacao) {
        this.taxaImportacao = novaTaxaImportacao;
    }
}
