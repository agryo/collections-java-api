package main.java.map.Pesquisa;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() { return this.nome; }
    public double getPreco() { return this.preco; }
    public int getQuantidade() { return this.quantidade; }

    //Método para converter para String
    @Override
    public String toString() {
        return "\nProduto {" +
            " nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" + "}";
    }
}
