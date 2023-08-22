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
     * O método é público (public), não retorna nada (void), o nome do método é adicionarTarefa(),
     * ele recebe uma "String descricao" dentro dos parenteses "()".
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
     * O método é público (public), não retorna nada (void), o nome do método é removerTarefa(),
     * ele recebe uma "String descricao" dentro dos parenteses "()".
     */
    public void removerTarefa(String descricao) {
        /*
         * A lista pode ter elementos iguais, então a proposta é criar uma nova lista, com os itens que
         * vão ser removidos e só depois remover todos os itens da lista.
         * --------------------------------------------------------------------------------------------------------------
         * Primeiro cria uma lista (List) do tipo Tarefa (<Tarefa>), essa lista nova vai se chamar "tarefasParaTemover"
         * e essa lista vai receber um Novo ArrayList vazia (new ArrayList<>).
         */
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        /*
         * Aqui o ForEach percorre a lista buscando todas as tarefas iguais.
         * Para (for) cada Tarefa (tipo Tarefa), vê a tarefa atual (item tarefa) na lista de tarefas (tarefaList).
         */
        for (Tarefa tarefa : tarefaList) {
            /*
             * Em seguida faz um teste, Se (if) a tarefa (item atual "tarefa"), ao pegar a descrição (".getDescricao()"),
             * e comparar com a "descricao" informada ignorando maiúscula e minúscula (".equalsIgnoreCase(descricao)"),
             * forem iguais (true). Então adiciona essa tarefa atual a lista de "tarefasParaRemover" 
             * ("tarefasParaRemover.add(tarefa)").
             */
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        /*
         * Após terminar o laço de repetição ForEach, e selecionar todas as tarefas que vai remover na lista nova,
         * ele remove todos os itens iguais da "tarefaList". ("tarefaList.removeAll(tarefasParaRemover)")
         */
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Método para saber o tamanho total da lista de Tarefas
    /* 
    * O método é público (public), retorna um número inteiro (int), o nome do método é obterNumeroTotalTarefas(),
    * ele não recebe nenhum parâmetro dentro dos parenteses "()".
    */
    public int obterNumeroTotalTarefas() {
        // E ele retorna (return) apenas o tamanho total da "tarefaList" com o método (".size()").
        return tarefaList.size();
    }

    //Método de obter as descrições das tarefas
    /*
     * O método é público (public), não retorna nada (void), o nome do método é obterDescricoesTarefas(),
     * ele não recebe nada dentro dos parenteses "()".
     */
    public void obterDescricoesTarefas() {
        //E ele apenas imprime, exibe ("System.out.println(tarefaList)") a "tarefaList" na tela.
        System.out.println(tarefaList);
    }
}
