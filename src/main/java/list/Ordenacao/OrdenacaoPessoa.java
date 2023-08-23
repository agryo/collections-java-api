package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //Atributo
    private List<Pessoa> listPessoa;

    //Construtor
    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }
    
    //Método adicionar uma pessoa
    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    //Método ordenar lista por idade
    public List<Pessoa> ordenarIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Método ordenar lista por altura
    public List<Pessoa> ordenarAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
        return pessoasPorAltura;
    }
}
