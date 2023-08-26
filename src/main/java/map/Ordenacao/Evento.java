package main.java.map.Ordenacao;

public class Evento {
    //Atributos
    private String nome;
    private String atracao;

    //Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    //Getters
    public String getNome() { return this.nome; }
    public String getAtracao() { return this.atracao; }
    
    //Método converter para String
    @Override
    public String toString() {
        return " Evento {" +
            " nome='" + getNome() + "'" +
            ", atracao='" + getAtracao() + "'" + "}\n";
    }
}
