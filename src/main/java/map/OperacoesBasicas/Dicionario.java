package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    private Map<String, String> dicionarioPalavrasMap;

    //Construtor
    public Dicionario() {
        this.dicionarioPalavrasMap = new HashMap<>();
    }

    //Método adicionar nova palavra no dicionario
    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioPalavrasMap.put(palavra, definicao);
    }

    //Método remover palavra do dicionario
    public void removerPalavra(String palavra) {
        if (!dicionarioPalavrasMap.isEmpty()) {
            dicionarioPalavrasMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    //Método para exibir as palavras do dicionario
    public void exibirPalavras() {
        if (!dicionarioPalavrasMap.isEmpty()) {
            System.out.println(dicionarioPalavrasMap);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    //Método pesquisar palavra no dicionario
    public String pesquisarPorPalavra(String palavra) {
        return dicionarioPalavrasMap.get(palavra);
    }
}
