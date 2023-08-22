package main.java.list.OperacoesBasicas;

public class Main {
    /*
     * Aqui é a classe para testar, usar todos os métodos criados do List.
     */
    public static void main(String[] args) {
        /*
         * Aqui é criada a "listaTarefa" através da classe "ListaTarefa" que foi criada nesse mesmo diretório (package).
         * Criar um objeto "ListaTarefa", com o nome "listaTarefa" que recebe uma nova ListaTarefa ("new ListaTarefa()").
         */
        ListaTarefa listaTarefa = new ListaTarefa();

        //Essa nova lista é criada vazia como é no construtor dela, vamos usar o primeiro método para conferir
        System.out.println("O número total de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Agora adicionar uma nova tarefa usando outro método que foi criado
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        //Tarefa repetida para testar o outro método de remover
        listaTarefa.adicionarTarefa("Tarefa 1");
        //E agora confere se já temos algum item na lista
        System.out.println("O número total de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Agora o método removerTarefa
        listaTarefa.removerTarefa("Tarefa 1");
        //Conferindo se restou 2
        System.out.println("O número total de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Agora o método de obter as descrições das tarefas
        listaTarefa.obterDescricoesTarefas();
    }
}

