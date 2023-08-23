package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo
    private List<Integer> numerosInteiros;

    //Construtor
    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    //Método adicionar número
    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    //Método somar números
    public int calcularSoma() {
        int soma = 0;
        for (Integer num : numerosInteiros) {
            soma += num;
        }
        return soma;
    }

    //Método encontrar maior número
    public int encontrarMaiorNumero() {
        int numMaior = Integer.MIN_VALUE;
        if (!numerosInteiros.isEmpty()) {
            for (Integer num : numerosInteiros) {
                if (num >= numMaior) {
                    numMaior = num;
                }
            }
            return numMaior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Método encontrar menor número
    public int encontrarMenorNumero() {
        int numMenor = Integer.MAX_VALUE;
        if (!numerosInteiros.isEmpty()) {
            for (Integer num : numerosInteiros) {
                if (num <= numMenor) {
                    numMenor = num;
                }
            }
            return numMenor;
        } else {
            throw new RuntimeException("A lista está vazia!");            
        }
    }

    //Método exibir os números
    public void exibirNumeros() {
        if (!numerosInteiros.isEmpty()) {
            System.out.println(this.numerosInteiros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
