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


    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof Convidado)) { return false; }
        return getCodigoConvite() == getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
    
    //Conveter para String
    @Override
    public String toString() {
        return "\nConvidado {" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" + "}";
    }
}