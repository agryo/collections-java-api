package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributo
    private List<Integer> listNumeros;

    //Construtor
    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    //Método adicionar número a lista
    public void adicionarNumero(int numero) {
        this.listNumeros.add(numero);
    }

    /*
     * Método ordenação ascendente, esse método é publico (public) vai retornar uma lista de inteiros (List<Integer>),
     * tem que usar o "Integer" pois só se pode usar objetos no "List" e o nome é "ordenarAscendente()"
     */
    public List<Integer> ordenarAscendente() {
        /*
         * Ao chamar o método ele cria uma lista de inteiros (List<Integer>) e o nome da lista é "numerosAscendente",
         * em seguida essa lista recebe um novo ArrayList com o atributo "listNumeros" dessa classe.
         */
        List<Integer> numerosAscendente = new ArrayList<>(this.listNumeros);
        //O "If" faz o teste para verificar se a lista está vazia e se NÃO ("!" simbolo de negação) estiver, ele entra no "If".
        if (!listNumeros.isEmpty()) {
            /*
             * Ao entrar no "If", usa a "Collections" do Java para ordenar os números com o método "sort()" usando a 
             * lista que recebeu os dados no inicio desse método.
            */
            Collections.sort(numerosAscendente);
            //Após finalizar a ordenação ele retorna (return) essa lista já ordenada.
            return numerosAscendente;
        } else { //Só entra no "Else" (se não), caso a lista esteja vazia.
            //E retorna nesse caso uma mensagem de "erro" informando que a lista está vazia.
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    /*
     * Método ordenação descendente, esse método é publico (public) vai retornar uma lista de inteiros (List<Integer>),
     * tem que usar o "Integer" pois só se pode usar objetos no "List" e o nome é "ordenarDescendente()"
     */
    public List<Integer> ordenarDescendente() {
        /*
         * Ao chamar o método ele cria uma lista de inteiros (List<Integer>) e o nome da lista é "numerosDescendente",
         * em seguida essa lista recebe um novo ArrayList com o atributo (lista) "listNumeros" dessa classe.
         */
        List<Integer> numerosDescendente = new ArrayList<>(this.listNumeros);
        //O "If" faz o teste para verificar se a lista está vazia e se NÃO ("!" simbolo de negação) estiver, ele entra no "If".
        if (!listNumeros.isEmpty()) {
            /*
             * Ao entrar no "If", usa a "Collections" do Java para ordenar os números com o método "sort()" usando o 
             * outro método da "Collections" para inverter a ordem (".reverseOrder()") como parâmetro.
            */
            numerosDescendente.sort(Collections.reverseOrder());
            //Após finalizar a ordenação ele retorna (return) essa lista já ordenada de forma invertida.
            return numerosDescendente;
        } else { //Só entra no "Else" (se não), caso a lista esteja vazia.
            //E retorna nesse caso uma mensagem de "erro" informando que a lista está vazia.
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    //Método para exibir números
    public void exibirNumeros() {
        if (!listNumeros.isEmpty()) {
            System.out.println(this.listNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
