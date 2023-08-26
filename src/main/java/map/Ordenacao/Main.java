package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, 4, 14), "Skank", "Show do Skank em Cruzeta");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 31), "One Piece", "Estreia de One Piece Live Action.");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 8, 26), "Bleach", "Mais um episódio");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 19), "Lua Nova", "A maior lua nova de todos os tempos");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

        System.out.println("Resolução do desafio, segundo teste de métodos...");
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new Livro("1984", "George Orwell",  19.65d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d ));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 26.95d));
        livrariaOnline.adicionarLivro("https://a.co/d/2bZ44XI", new Livro("A Guerra dos Tronos: volume 1", "George R. R. Martin", 69.99d));
        livrariaOnline.adicionarLivro("https://a.co/d/33vaoYX", new Livro("Programação Orientada a Objetos com Java", "Michael Kolling", 57.80d));
        System.out.println("Livros adicionados: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        livrariaOnline.removerLivro("Caixa de Pássaros - Bird Box: Não Abra os Olhos");
        System.out.println("Após remover livro: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Pesquisar por nome do Autor: \n" + livrariaOnline.pesquisarLivrosPorAutor("Michael Kolling"));

        System.out.println("O livro mais caro é: \n" + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais barato é: \n" + livrariaOnline.exibirLivroMaisBarato());
    }
}
