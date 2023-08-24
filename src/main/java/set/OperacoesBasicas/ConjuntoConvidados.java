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

    //Método remover convidado por codigo de convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    //Método contar convidados
    public int contarConvidados() {
        return convidadosSet.size();
    }

    //Método exibir os convidados
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
}
