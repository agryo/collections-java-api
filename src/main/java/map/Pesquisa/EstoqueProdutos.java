package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributo
    private Map<Long, Produto> estoqueProdutosMap;

    //Construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //Método adicionar produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //Método exibir os produtos em estoque
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    //Método para calcular o valor total do estoque
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio!");
        }
        return valorTotalEstoque;
    }

    //Método para encontrar o produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisCaro;
    }
}
