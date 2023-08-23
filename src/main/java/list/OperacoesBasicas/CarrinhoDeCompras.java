package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  //Atributo
  private List<Item> itemList;

  //Construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  //Método "adicionarItem" que recebe os atributos da classe "Item" e adiciona a "itemList"
  public void adicionarItem(String nome, double preco, int quantidade) {
    Item item = new Item(nome, preco, quantidade);
    this.itemList.add(item);
  }

  //Método "removerItem" que remove os itens da lista "itemList"
  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    //Aqui testa se a lista está vazia, se ela não estiver vazia entra no ForEach
    if (!itemList.isEmpty()) {
      for (Item i : itemList) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else { //Se estiver entra no Else e exibe a mensagem
      System.out.println("A lista está vazia!");
    }
  }

  //Método "calcularValorTotal"
  public double calcularValorTotal() {
    double valorTotal = 0d;
    //Testa se a lista está vazia e se não estiver entra no ForEach
    if (!itemList.isEmpty()) {
      /*
       * O ForEach faz o cálculo do preço do item atual vezes (*) a quantidade e atribui a variável "valorItem",
       * em seguida soma a variável "valorTotal" com "valorItem" e ao terminar, retorna (return) o "valorTotal"
       */
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else { //Se estiver vazia entra no Else e exibe a mensagem
      throw new RuntimeException("A lista está vazia!");
    }
  }

  //Método "exibirItens"
  public void exibirItens() {
    //Se não estiver vazia a lista, percorre ela e exibe os itens
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
    } else { //Se estiver vazia exibe a mensagem
      System.out.println("A lista está vazia!");
    }
  }

  //Método "toString" faz a conversão para String dos itens para não mostrar apenas o local na memória
  @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
  }


  //Testando todos os métodos abaixo no Main
  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Lápis", 2.65d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2.99d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35.50d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    System.out.println("Exibir Itens da Lista");
    carrinhoDeCompras.exibirItens();

    carrinhoDeCompras.removerItem("Lápis");
    System.out.println("\nExibir Itens da Lista, após remoção dos Lápis");
    carrinhoDeCompras.exibirItens();

    System.out.println("\nO valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}