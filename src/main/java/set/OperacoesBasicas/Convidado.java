package main.java.set.OperacoesBasicas;
import java.util.Objects;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;

    //Construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Getters
    public String getNome() { return nome; }
    public int getCodigoConvite() { return codigoConvite; }

    /*
     * Método para comparar se dois objetos são iguais.
     * Aqui ele sobrescreve (@Override) o método original da classe "Objects" do Java.
     * É um método público (public) que retorna um "boolean" com o nome "equals()" e passa como parâmetro um "Object" nome "o".
     * O "equals()" é usado para comparar dois objetos e determinar se eles são iguais.
     */
    @Override
    public boolean equals(Object o) {
        //O primeiro "If" testa se o objeto atual (this) é igual ao objeto passado no parâmetro (Object o).
        if (this == o) { return true; } //Se for igual ele retorna verdadeiro (true).
        /*
         * O segundo "If" verifica se o objeto "o" é uma instância da classe "Convidado".
         * Se não for, o método "equals()" retorna falso (false) imediatamente.
         * Isso é importante porque o "equals()" só deve comparar dois objetos que são da mesma classe. 
         * Se "o" não for uma instância da classe "Convidado", então não faz sentido comparar o código de convite dos dois objetos.
         */
        if (!(o instanceof Convidado)) { return false; }
        //Ao final retorna (return) verdadeiro (true) se o código de convite dos dois objetos for o mesmo.
        return getCodigoConvite() == getCodigoConvite();
    }

    /*
     * Método para calcular um valor hash para um objeto.
     * Aqui ele sobrescreve (@Override) o método original da classe "Objects" do Java.
     * É um método público (public) que retorna um inteiro (int) com o nome "hashCode()" e não passa nenhum parâmetro.
     * O "hashCode()"" é usado para calcular um valor hash para um objeto, que pode ser usado para comparar objetos de forma 
     * mais eficiente.
     */
    @Override
    public int hashCode() {
        //Aqui ele retorna o valor hash do atributo "codigoConvite".
        return Objects.hash(getCodigoConvite());
        /*
         * Essa implementação do método "hashCode()"" é simples e eficaz. Ela garante que dois objetos que são considerados
         * iguais pelo equals() tenham o mesmo valor hash.
         * No entanto, é importante observar que essa implementação pode não ser ideal para todos os casos.
         * Se o atributo "codigoConvite" for um valor que pode ser alterado com frequência, então o valor hash do objeto
         * também será alterado. Isso pode afetar o desempenho das coleções que usam o "hashCode()" para comparar objetos.
         */
    }
    
    //Conveter para String
    @Override
    public String toString() {
        return "\nConvidado {" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" + "}";
    }
}