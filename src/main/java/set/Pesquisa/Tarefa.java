package main.java.set.Pesquisa;

public class Tarefa {
    //Atributos
    private String descricao;
    private boolean concluida;

    //Construtor
    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    //Métodos Getters
    public String getDescricao() { return descricao; }
    public boolean isConcluida() { return concluida; }

    //Métodos Setters
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }

    //Método converter para String
    @Override
    public String toString() {
    return "\nTarefa {" +
        "descricao= '" + descricao + '\'' +
        ", concluida= " + concluida + '}';
    }
}