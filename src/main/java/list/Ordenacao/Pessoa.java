package main.java.list.Ordenacao;

import java.util.Comparator;

/*
 * A classe "Comparable" fornece um método chamado "compareTo()" que pode ser usado para comparar objetos da mesma classe.
 * Quando você implementa (implements) a interface "Comparable", você está dizendo ao Java como comparar objetos da 
 * sua classe. (Nesse caso "Pessoa").
 */
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

    /*
     * Método da Interface Compareble.
     * O método é público (public) vai retornar um inteiro primitivo (int) tem o nome "compareTo()" e compara a idade do 
     * objeto atual com a idade do objeto passado como parâmetro. 
     */
    @Override
    public int compareTo(Pessoa o) {
        /*
         * Se a idade do objeto atual for menor que a idade do objeto passado como parâmetro, o método "compareTo()" 
         * retornará um valor menor que zero. Se a idade do objeto atual for igual à idade do objeto passado como parâmetro,
         * o método "compareTo()" retornará um valor igual a zero. Se a idade do objeto atual for maior que a idade do 
         * objeto passado como parâmetro, o método "compareTo()" retornará um valor maior que zero.
         */
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

/*
 * Você precisa criar outra classe para implementar a interface "Comparator" porque a interface "Comparable" não fornece
 * uma maneira de comparar objetos com base em seus atributos. A interface "Comparator" fornece um método chamado "compare()"
 * que pode ser usado para comparar objetos com base em qualquer critério que você desejar.
 */

/*
 *  A classe "ComparetorPorAltura" implementa (implements) a interface "Comparator" para comparar objetos da classe 
 * "Pessoa" com base em suas alturas. O método "compare()"" da classe "ComparetorPorAltura" usa o método 
 * "Double.compare()" para comparar os valores de altura dos dois objetos, que são do tipo "Double".
 */
class ComparetorPorAltura implements Comparator<Pessoa> {
    //O "@Override" informa que está sendo sobrescrito o método original da "Comparator".
    @Override
    /*
     * Nesse caso foi sobrescrito para um método publico (public) que retona um inteiro primitivo (int) com o nome
     * "compare" e passa dois parâmetros (Objetos nesse caso) do tipo "Pessoa" (o1 e o2).
     */
    public int compare(Pessoa o1, Pessoa o2) {
        //Então retorna (return) como "Double" a comparação de altura (".getAltura()") dos objetos o1 e o2.
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
    
}
