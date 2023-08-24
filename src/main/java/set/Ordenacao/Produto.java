package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    //Atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Método para comparar o nome
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Métodos Getters
    public long getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    //Método para evitar produtos iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        return getCodigo() == getCodigo();
    }

    //Método usado junto com o equals para evitar produtos iguais
    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    //Método para converter para String
    @Override
    public String toString() {
        return "\nProduto {" +
            "codigo=" + codigo +
            ", nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade + '}';
    }
}

//Classe para implementar o Comparator do Java
class ComparatorPorPreco implements Comparator<Produto> {   
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}








