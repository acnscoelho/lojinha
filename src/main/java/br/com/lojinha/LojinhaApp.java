package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.GRANDE);

        meuProduto.setNome("XBOX");
        meuProduto.setValor(30);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); //0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso); //1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos de energia", 2);
        itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MÉDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("JL", Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaImposto(0.6089);
        System.out.println(meuProdutoInternacional.getTaxaImposto());

     }

}

