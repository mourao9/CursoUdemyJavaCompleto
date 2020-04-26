package entities;

import java.util.Locale;

public class Produto {
    private String nome;
    private double price;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double price, int quantidade) {
        this.nome = nome;
        this.price = price;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalValueinStock() {
        return this.price * this.quantidade;
    }

    public void addQuatidadeProduto(int item) {
        this.quantidade += item;
    }

    public void removeQuatidadeProduto(int item) {
        this.quantidade -= item;
    }

    public String toString() {
    	Locale.setDefault(Locale.US);
        return getNome() +
                ", R$" + String.format("%.2f", getPrice()) +
                ", " + getQuantidade() + " unidades, Total: R$"
                + String.format("%.2f", getTotalValueinStock());
    }
    
    public String etiquetaDePreco() {
    	Locale.setDefault(Locale.US);
    	return getNome() + " - R$" + String.format("%.2f", getPrice());
    }

}
