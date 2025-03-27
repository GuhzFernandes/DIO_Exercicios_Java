package Edu.gus.collections.list.basico.exercise2.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        this.carrinho.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item:carrinho){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        carrinho.forEach(item -> System.out.println(item));
    }
}
