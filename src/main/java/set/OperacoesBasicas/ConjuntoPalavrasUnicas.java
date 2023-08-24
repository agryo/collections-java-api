package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<String> palavrasUnicasSet;
    
    //Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //Método adicionar palavra
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    //Método remover palavra
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            palavrasUnicasSet.remove(palavra);
        } else {
            System.out.println("O conjunto de Palavras está vazio!");
        }
    }

    //Método verificar se contem a palavra
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    //Método exibir as palavras do conjunto
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto de Palavras está vazio!");
        }
    }
}
