package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributos da ListaTarefa
    private List<Tarefa> tarefaList;

    //Construtor do Objeto ListaTarefa
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //Método de adicionar nova tarefa
    /* 
     * O método é público (public), não retorna nada (void), o nome do método é adicionarTarefa,
     * ele recebe uma String descricao dentro dos parenteses "()".
     */
    public void adicionarTarefa(String descricao) {
        /* 
         * O atributo tarefaList criado lá em cima privado vai adicionar (.add) uma nova Tarefa (que é a outra classe)
         * (Ex. "new Tarefa(descricao)") nova Tarefa e já recebe a descricao no próprio método que é uma String.
         */
        tarefaList.add(new Tarefa(descricao));
    }

    //Método de remover uma tarefa
    /*
     * O método é público, não retorna nada (void), o nome do método é removerTarefa,
     * ele recebe uma String descricao dentro dos parenteses "()".
     */
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
}
