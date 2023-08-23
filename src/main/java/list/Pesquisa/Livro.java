package main.java.list.Pesquisa;

public class Livro {
    //Atributos do Objeto Livro
    private String titulo;
    private String autor;
    private int ano;

    //Construtor do Objeto Livro
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Métodos Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    //Método para converter para String os dados
    @Override
    public String toString() {
        return "\nLivro-{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", ano='" + getAno() + "'" + "}";
    }
}