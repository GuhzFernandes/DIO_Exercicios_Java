package Edu.gus.collections.list.basico.exercise2.model;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return  "Nome: " + this.nome +
                "\nPreço: "+ this.preco+
                "\nQuantidade: "+ this.quantidade;
    }
}
