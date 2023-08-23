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

        System.out.println("\nAgora testes da segunda lista de métodos");
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(59);
        somaNumeros.adicionarNumero(95);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(38);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(70);

        System.out.println("A soma de todos os números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior números é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O mmenor números é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Todos os números da lista: ");
        somaNumeros.exibirNumeros();
    }
}
