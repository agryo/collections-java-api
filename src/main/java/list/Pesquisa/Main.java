package main.java.list.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1985);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 1986);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1999);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2021);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarIntervaloAnos(1985, 1999));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
    }
}
