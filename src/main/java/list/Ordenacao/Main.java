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

        System.out.println("Agora testes da segunda lista de métodos");
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(51);
        ordenacaoNumeros.adicionarNumero(16);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(38);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
