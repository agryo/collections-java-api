package main.java.list.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 26, 1.89);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 16, 1.59);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 12, 1.76);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 16, 1.50);
        ordenacaoPessoa.adicionarPessoa("Nome 6", 26, 1.15);

        System.out.println(ordenacaoPessoa.ordenarIdade());
        System.out.println(ordenacaoPessoa.ordenarAltura());
    }
}
