package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) { // psvm
        System.out.println("----------------------------");
        Produto meuProduto = new Produto("APPLE", Tamanho.PROMAX);


        meuProduto.setNome ("Iphone 15");
        meuProduto.setValor (11.900);
      //  meuProduto.setTamanho (Tamanho.PROMAX);
      //  meuProduto.setMarca("PAULA");


        List<ItemIncluso> ItensInclusos = new ArrayList<>();
        ItemIncluso primeiraAdicional = new ItemIncluso("Carregador", 1);
        ItensInclusos.add (primeiraAdicional); // 0

        ItemIncluso segundaAdicional = new ItemIncluso("Airpod", 1);
        ItensInclusos.add (segundaAdicional); // 1

        ItemIncluso terceiraAdicional = new ItemIncluso("Case", 2);
        ItensInclusos.add (terceiraAdicional); // 2

        meuProduto.setItensInclusos(ItensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());

        System.out.println("----------------------------");

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());

        System.out.println("----------------------------");

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("----------------------------");

    }
}//fimalgoritmo

/*
* String - Caractere
* Inteiro - Numero inteiro
* Double - Numero fracionado
* Boolean - Verdadeiro ou Falso
*/