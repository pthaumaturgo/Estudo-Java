package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) { // psvm
        Produto meuProduto = new Produto();

        meuProduto.setNome ("Iphone 15");
        meuProduto.setValor (11.900);
        meuProduto.setMarca("Apple");
        meuProduto.setTamanho ("ProMax");

        List<String> ItensInclusos = new ArrayList<>();
        ItensInclusos.add ("Caixa"); //0
        ItensInclusos.add ("Airpods"); //1
        ItensInclusos.add ("Cabo carregador"); //2
        ItensInclusos.add ("Case"); //3
        meuProduto.setItensInclusos(ItensInclusos);

        System.out.println("----------------------------");
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos().getLast());
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