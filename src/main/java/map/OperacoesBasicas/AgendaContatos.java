package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    /* Atributo
     * Agora o atributo é criado usando o "Map" também do Java.
     * Esse atributo é privado (private) do tipo "Map" que vai ter uma "Key" do tipo "String" e um "Value" do tipo "Integer".
     * E o nome desse atributo (variável) vai ser "agendaContatoMap".
     * A "Key" do "Map" não pode ter outra com o mesmo valor, somente única.
    */
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //Método para adicionar um contato
    public void adicionarContato(String nome, Integer telefone) {
        /* O "Map" usa o método (".put()") para adicionar os itens.
         * O método ".put()" serve tanto para adicionar um item, como também serve para atualizar essa mesma chave (key).
         * Então na hora do teste, você verá que ele adiciona o primeiro e na segunda ocorrencia da mesma chave (key)
         * ele vai apenas atualizar o número (value) do mesmo contato.
         */
        agendaContatoMap.put(nome, telefone);
    }

    //Método para remover um contato
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            /*
             * Uma vantagem do "Map" é que não precisar criar um "ForEach" para percorrer a lista até achar o valor,
             * pois o "Map" usa "Key" e ela só pode ter um único valor e não pode ser repetido.
             */
            agendaContatoMap.remove(nome);
        }
    }

    //Método para exibir os contatos da lista "Map"
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    /* Método para pesquisar pelo nome um contato
     * É um método público (public) que retorna um "Integer" com o nome "pesquisarPorNome()" e recebe o parâmetro "nome".
     * que é do tipo "String".
    */
    public Integer pesquisarPorNome(String nome) {
        //Primeiro ele cria uma variável "numeroPorNome" do tipo "Integer" que recebe "null"
        Integer numeroPorNome = null;
        //O "If" verifica se a "agendaContatoMap" está vazia, se não estiver vazia ela entra no "If"
        if (!agendaContatoMap.isEmpty()) {
            //Ao entrar no "If" a variável "numeroPorNome" recebe o número do contato que foi passado no parâmetro
            numeroPorNome = agendaContatoMap.get(nome);
        }
        //E então ele retorna (return) somente o número (numeroPorNome) do contato correspondente
        return numeroPorNome;
    }
}