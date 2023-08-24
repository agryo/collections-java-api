package main.java.set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Agryo", 99991122);
        agendaContatos.adicionarContato("Agryo Ctz", 99991157);
        agendaContatos.adicionarContato("Agryo Stallion", 99998522);
        agendaContatos.adicionarContato("Camila", 99993344);
        agendaContatos.adicionarContato("Camila DIO", 99995566);
        agendaContatos.adicionarContato("Karleanderson", 99881122);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa contato: " + agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Karleanderson", 88992211));
        agendaContatos.exibirContatos();
    }
}
