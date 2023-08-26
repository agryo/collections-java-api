package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // Atributo
    Map<LocalDate, Evento> eventosMap;

    // Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Método adicionar novo evento
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // Método exibir a agenda de eventos
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    // Método obter próximo evento futuro
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Próximo evento: " + entry.getValue() + "Acontecerá na data " + entry.getKey());
                break;
            }
        }
    }
}
