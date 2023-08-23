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

    //Método ordenação ascendente
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    //Método ordenação descendente
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
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
