package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadosSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    //Método adicionar novo convidado
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    /*
     * Método remover convidado por codigo de convite, é público (public) não retorna nada (void) com o nome
     * "removerConvidadoPorCodigoConvite()" e vai receber como parâmetro um inteiro primitivo (int codigoConvite).
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        //Primeiro cria uma lista do tipo "Convidado" com o nome "convidadoParaRemover" e deixa ela vazia (null).
        Convidado convidadoParaRemover = null;
        //O "ForEach" vai percorrer a lista "Convidado" por cada "convidado" da lista "convidadoSet".
        for (Convidado convidado : convidadosSet) {
            //O "If" vai verificar se o código de convite (.getCodigoConvite) do "convidado" atual é igual ao passado no parâmetro.
            if (convidado.getCodigoConvite() == codigoConvite) {
                //Se for igual ele entra no "If" e o "convidadoParaRemover" recebe o "convidado" atual do "ForEach".
                convidadoParaRemover = convidado;
                //E para "break" o processo, pois já achou o que queria.
                break;
            }
        }
        //E depois de parar, ele remove (".remove()") da lista original (convidadosSet) o convidado que foi localizado (convidadoParaRemover).
        convidadosSet.remove(convidadoParaRemover);
    }

    //Método contar convidados
    public int contarConvidados() {
        //Aqui retorna (return) o tamanho total da lista "convidadosSet" usando o método (".size()").
        return convidadosSet.size();
    }

    //Método exibir os convidados
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
}
