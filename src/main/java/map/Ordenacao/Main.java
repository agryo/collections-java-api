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
    }
}
