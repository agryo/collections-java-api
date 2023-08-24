package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributos
    private Set<Tarefa> tarefaSet;

    //Construtor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //Método adicionar uma nova tarefa
    public void adicionarTarefa(Tarefa tarefa) {
        tarefaSet.add(tarefa);
    }

    //Método remover uma tarefa
    public void removerTarefa(String descricao) { 
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    //Método exibir as tarefas da lista
    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    //Método para contar quantas tarefas existem na lista
    public int contarTarefas() {
        return tarefaSet.size();
    }

    //Método para obter as tarefas já concluídas
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    //Método para obter as tarefas que ainda não foram concluídas
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasNaoConcluidas.add(tarefa);
            }
        }
        return tarefasNaoConcluidas;
    }

    //Método marcar uma tarefa como concluída
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    //Método marcar uma tarefa como pendente
    public void marcarTarefaPendente(String descricao) { 
        Tarefa tarefaMarcarPendente = null;
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarPendente = tarefa;
                break;
            }
        }
        if (tarefaMarcarPendente != null) {
            tarefaMarcarPendente.setConcluida(true);
            System.out.println("Tarefa marcada como pendente: " + tarefaMarcarPendente.getDescricao());
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }

    //Método limpar a lista de tarefas
    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            tarefaSet.clear();
        }
    }
}
