package main.java.list.Ordenacao;

import java.util.ArrayList;
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

    /* 
     * Método ordenar lista por altura, é um método público (public) que retorna uma lista de pessoa ("List<Pessoa>"),
     * com o nome "ordenarAltura()".
     */
    public List<Pessoa> ordenarAltura() {
        /*
         * A primeira linha do método cria uma nova lista de pessoas ("List<Pessoa>") chamada "pessoasPorAltura". 
         * A nova lista é uma cópia da lista original de pessoas, "listPessoa". Isso é feito para evitar alterar a lista original.
         */
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        /*
         * A segunda linha do método usa o método "sort()" da classe "Collections" do Java para ordenar a lista "pessoasPorAltura".
         * O método "sort()" usa o comparador "ComparetorPorAltura" (que foi criado na classe Pessoa) para comparar os elementos 
         * da lista. O comparador "ComparetorPorAltura" compara os elementos da lista com base em suas alturas.
         */
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
        //Após terminar a ordenação, ele retorna a lista nova "pessoasPorAltura".
        return pessoasPorAltura;
    }
}
