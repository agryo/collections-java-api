package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //Atributos de Pessoa
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Método da Interface Compareble
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

    //Métodos Getters
    public String getNome() { return this.nome; }

    public int getIdade() { return this.idade; }

    public double getAltura() { return this.altura; }

    //Método que converte para String

    @Override
    public String toString() {
        return "\nPessoa {" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", altura='" + getAltura() + "'" + "}";
    }
}

class ComparetorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
    
}
