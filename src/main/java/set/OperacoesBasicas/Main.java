package main.java.set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1237);
        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();

        System.out.println("Testes da segunda tarefa de desafio");
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
