package main.java.map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();
        estoque.obterProdutoMaisCaro();
        estoque.obterProdutoMaisBarato();
        estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();

        estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
        estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
        estoque.adicionarProduto(3L, "Produto D", 2, 4.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

        System.out.println("\n\nSegundo desafio testes...");
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.removerPalavra("Palavra 1");
        contagemPalavras.adicionarPalavra("Palavra 5");
        contagemPalavras.adicionarPalavra("Palavra 3");
        contagemPalavras.adicionarPalavra("Palavra 1");
        contagemPalavras.adicionarPalavra("Palavra 2");
        contagemPalavras.adicionarPalavra("Palavra 1");
        contagemPalavras.adicionarPalavra("Palavra 5");
        contagemPalavras.adicionarPalavra("Palavra 3");
        contagemPalavras.adicionarPalavra("Palavra 1");
        contagemPalavras.adicionarPalavra("Palavra 3");
        contagemPalavras.adicionarPalavra("Palavra 3");
        contagemPalavras.adicionarPalavra("Palavra 4");
        contagemPalavras.adicionarPalavra("Palavra 3");
        contagemPalavras.adicionarPalavra("Palavra 1");
        contagemPalavras.adicionarPalavra("Palavra 4");
        contagemPalavras.adicionarPalavra("Palavra 1");
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        contagemPalavras.removerPalavra("Palavra 4");
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
