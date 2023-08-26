package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributo
    Map<String, Integer> contagemPalavras;

    //Construtor
    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    //Método adicionar palavra a contagem
    public void adicionarPalavra(String palavra) {
        contagemPalavras.compute(palavra, (key, value) -> {
            if (value == null) return 1; 
            else return value + 1;
        });
    }

    //Método para remover uma palavra caso exista
    public void removerPalavra(String palavra) {
        if (!contagemPalavras.isEmpty()) {
            contagemPalavras.remove(palavra);
        } else {
            System.out.println("Ainda não existem palavras na contagem!");
        }
    }

    //Método para contar as palavras em suas respectivas contagem
    public int exibirContagemPalavras() {
        Integer contagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            contagem += entry.getValue();
        }
        return contagem;
    }

    //Método encontrar palavra mais frequente
    public void encontrarPalavraMaisFrequente() {
        String maiorKey = "";
        Integer maiorValue = 0;
        for (Map.Entry<String, Integer> palavra : contagemPalavras.entrySet()) {
            if (palavra.getValue() > maiorValue) {
                maiorKey = palavra.getKey();
                maiorValue = palavra.getValue();
            }
        }
        System.out.println("A palavra mais repetida é: " + maiorKey + " e foi chamada " + maiorValue + " vezes.");
    }
}
