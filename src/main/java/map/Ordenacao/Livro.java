package main.java.map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro implements Comparable<Livro> {
    // Atributos
    private String titulo;
    private String autor;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters
    public String getTitulo() { return this.titulo; }
    public String getAutor() { return this.autor; }
    public double getPreco() { return this.preco; }

    // Método converter para String
    @Override
    public String toString() {
        return " Livro {" +
                " titulo='" + getTitulo() + "'" +
                ", autor='" + getAutor() + "'" +
                ", preco='" + getPreco() + "'" + "}\n";
    }

    // Método para comparar dois preços de livros
    @Override
    public int compareTo(Livro livro) {
        return Double.compare(preco, livro.getPreco());
    }
}

//Classe para poder comparar por autor
class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getAutor().compareToIgnoreCase(livro2.getValue().getAutor());
    }
}