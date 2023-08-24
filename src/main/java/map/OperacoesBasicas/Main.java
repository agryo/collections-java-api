package main.java.map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Agryo", 123456); //Chave "Agryo"
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Agryo", 5665); //Mesma chave "Agryo" e atualiza o número (value)
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Agryo Araujo", 99778587);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Agryo Araujo"));
    }
}
