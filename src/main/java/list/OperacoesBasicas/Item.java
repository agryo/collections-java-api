package main.java.list.OperacoesBasicas;

public class Item {
	//Atributos
	private String nome;
	private double preco;
	private int quant;

	//Construtor
	public Item(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}

	//Conversão para String
	@Override
	public String toString() {
		return "\nItem {" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quant +
				'}';
	}
}