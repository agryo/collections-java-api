package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos: Cria a variável "listLivros" do tipo "List" tipada com o objeto "Livro"
    private List<Livro> listLivros;

    //Construtor do "CatalogoLivros" já inicia a variável "listLivros" como uma nova "ArrayList"
    public CatalogoLivros() { this.listLivros = new ArrayList<>(); }

    //Método "adicionarLivro" que recebe os atributos de um novo "Livro" e adiciona a "listLivros"
    public void adicionarLivro(String titulo, String autor, int ano) {
        listLivros.add(new Livro(titulo, autor, ano));
    }

    //Método "pesquisarPorAutor" que recebe o Autor no parâmetro e retorna uam "List" do tipo "Livro"
    public List<Livro> pesquisarPorAutor(String autor) {
        /*
         * Aqui se cria uma nova variável local "livrosAutor" do tipo "List" tipada com o objeto "Livro",
         * em seguida recebe uma nova "ArrayList" vazia.
         */
        List<Livro> livrosAutor = new ArrayList<>();
        //O "If" testa se a lista "listLivros" está vazia e se não estiver vazia entra do "ForEach"
        if (!listLivros.isEmpty()) {
            //O "ForEach" percorre o objeto "Livro" em cada "livro" de toda a "listLivros"
            for (Livro livro : listLivros) {
                //Aqui o "If" testa se o parâmetro "autor" passado no método é igual ao do "livro" atual da "listLivros".
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    //Se for igual, ele adicionar a variável local "livrosAutor" esse "livro" autal com o mesmo autor.
                    livrosAutor.add(livro);
                }
            }
        }
        //Ao terminar o laço ele retorna a nova lista local "livrosAutor" com os livros de mesmo autor.
        return livrosAutor;
    }

    //Método "pesquisarIntervaloAnos" que recebe dois parâmetros "anoInicial" e "anoFinal" ambos do tipo "int" e retorna uma lista "Livro".
    public List<Livro> pesquisarIntervaloAnos (int anoInicial, int anoFinal) {
        /*
         * Aqui se cria uma nova variável local "livrosPorAnos" do tipo "List" tipada com o objeto "Livro",
         * em seguida recebe uma nova "ArrayList" vazia.
         */
        List<Livro> livrosPorAnos = new ArrayList<>();
        //O "If" testa se a lista "listLivros" está vazia e se não estiver vazia entra do "ForEach"
        if (!listLivros.isEmpty()) {
            //O "ForEach" percorre o objeto "Livro" em cada "livro" de toda a "listLivros"
            for (Livro livro : listLivros) {
                /*
                 * Aqui o "If" testa se o parâmetro "anoInicial" passado no método é maior ou igual ao ano (".getAno()") do "livro" atual da "listLivros"
                 * e também se o "anoFinal" é menor ou igual o mesmo "livro" por ano (".getAno()").
                 */
                if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                    //Se for verdade "true" ambos os testes, é adicionado o "livro" atual a nova lista "livrosPorAnos"
                    livrosPorAnos.add(livro);
                }                
            }
        }
        //Ao final ele retorna (return) a nova lista local "livrosPorAnos"
        return livrosPorAnos;
    }

    //Método "pesquisarPorTitulo" que recebe o parâmetro "titulo" do tipo "String" e retorna um objeto "Livro".
    public Livro pesquisarPorTitulo(String titulo) {
        //Aqui se cria uma variável "livroPesquisa" do tipo objeto "Livro" e incia vazia (null).
        Livro livroPesquisa = null;
        //O "If" testa se a "listLivros" principal está vazia.
        if (!listLivros.isEmpty()) {
            //Se não estiver vazia, entra no "ForEach" que percorre o objeto "Livro" por cada "livro" da "listLivros" principal.
            for (Livro livro : listLivros) {
                //O "If" verifica se o título passado no parâmetro (titulo) é igual ao "livro" atual na "listLivros"
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    //Se for igual, ele adiciona a nova variável local "livroPesquisa"
                    livroPesquisa = livro;
                    //E para o método com o "break"
                    break;
                }
            }            
        }
        //Após parar, retorna (return) o livro da variável local "livroPesquisa"
        return livroPesquisa;
    }
}