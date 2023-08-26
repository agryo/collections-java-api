package main.java.map.Ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LivrariaOnline {
    // Atributo
    Map<String, Livro> livrosDisponiveis;

    // Construtor
    public LivrariaOnline() {
        this.livrosDisponiveis = new HashMap<>();
    }

    // Método adicionar um novo livro a loja
    public void adicionarLivro(String link, Livro livro) {
        livrosDisponiveis.put(link, livro);
    }

    // Método para remover um livro pelo título
    public void removerLivro(String titulo) {
        Livro livroRemover = null;
        for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                livroRemover = entry.getValue();
                break; // Encontrou o livro, pode sair do loop
            }
        }
        if (livroRemover != null) {
            livrosDisponiveis.values().remove(livroRemover);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Método para exibir os livros em ordem de preço
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        // Crie um comparador que compara os livros com base no preço
        Comparator<String> comparadorPorPreco = (link1, link2) -> {
            double preco1 = livrosDisponiveis.get(link1).getPreco();
            double preco2 = livrosDisponiveis.get(link2).getPreco();
            return Double.compare(preco1, preco2);
        };
        // Use o comparador para criar o TreeMap que irá ordenar os livros por preço
        Map<String, Livro> livrosOrdenadosPorPreco = new TreeMap<>(comparadorPorPreco);
        livrosOrdenadosPorPreco.putAll(livrosDisponiveis);
        return livrosOrdenadosPorPreco;
    }

    // Método para pesquisar o livro pelo autor
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Set<Map.Entry<String, Livro>> livroPorAutorSet = new TreeSet<>(new ComparatorPorAutor());
        for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                livroPorAutorSet.add(entry);
            }
        }
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livroPorAutorSet) {
            livrosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosPorAutor;
    }

    // Método para saber qual é o livro mais caro
    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getPreco() > precoMaisCaro) {
                precoMaisCaro = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return livroMaisCaro;
    }

    // Método para saber qual é o mais barato
    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;
        for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getPreco() < precoMaisBarato) {
                precoMaisBarato = livro.getPreco();
                livroMaisBarato = livro;
            }
        }
        return livroMaisBarato;
    }
}
