package main.java.list.OperacoesBasicas;

public class Tarefa {
    //Atributo da classe
    private String descricao;
    
    //Método construtor do objeto Tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getters da classe
    public String getDescricao() {
        return this.descricao;
    }

    //Método que converte para String a descrição ao invés de mostrar o endereço de memória da descrição
    @Override
    public String toString() {
        return descricao;
    }

}
