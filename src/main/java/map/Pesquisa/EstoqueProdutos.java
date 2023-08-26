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

    //Método para encontrar o produto mais barato
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();                    
                }
            }
        } else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisBarato;
    }

    //Método para obter o produto com maior estoque, considerando a quantidade e o preço
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorProdutoEncontrado = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEstoque > maiorProdutoEncontrado) {
                    maiorProdutoEncontrado = valorProdutoEstoque;
                    produtoMaiorQuantidadeValorTotal = entry.getValue();
                }
            }
        } else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaiorQuantidadeValorTotal;
    }
}
