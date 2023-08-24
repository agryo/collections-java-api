package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Método adicionar contato a lista
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //Método exibir os contatos da lista
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    //Método pesquisar por nome na lista de contatos
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato contato : contatoSet) {
                if (contato.getNome().startsWith(nome)) {
                    contatoPorNome.add(contato);
                }
            }
        } else {
            System.out.println("A lista de contatos está vazia!");
        }
        return contatoPorNome;
    }

    //Método atualizar número do contato por nome
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
