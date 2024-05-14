package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) { // psvm
        Produto meuProduto = new Produto();

        meuProduto.setNome ("Iphone 15");
        meuProduto.setValor (11.900);
        meuProduto.setMarca("Apple");
        meuProduto.setTamanho ("ProMax");
        meuProduto.setItensInclusos("Carregador e fone");

        System.out.println("----------------------------");
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getValor());

        System.out.println("----------------------------");

    }
}//fimalgoritmo

/*
* String - Caractere
* Inteiro - Numero inteiro
* Double - Numero fracionado
* Boolean - Verdadeiro ou Falso
*/