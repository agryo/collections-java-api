package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private int numero;

    //Construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getters
    public String getNome() { return nome; }
    public int getNumero() { return numero; }
    //Setter de número
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        return Objects.equals(getNome(), getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "\nContato { " + nome + ", " + numero + " }";
    }
}