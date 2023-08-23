package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos
    private List<Livro> listLivros;

    public CatalogoLivros() { this.listLivros = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int ano) {
        listLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(livro);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisarIntervadoAnos (int anoInicial, int anoFinal) {
        List<Livro> livrosPorAnos = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                    livrosPorAnos.add(livro);
                }                
            }
        }
        return livrosPorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPesquisa = null;
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPesquisa = livro;
                    break;
                }
            }            
        }
        return livroPesquisa;
    }
}