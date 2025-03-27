package Edu.gus.collections.list.basico.exercise2;

import Edu.gus.collections.list.basico.exercise2.model.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens
        carrinho.adicionarItem("Nintendo Switch", 1999.99, 1);
        carrinho.adicionarItem("Pro Controller", 499.90, 2);
        carrinho.adicionarItem("Amiibo do Link", 129.99, 1);
        carrinho.adicionarItem("Nintendo Switch", 1999.99, 1); // item repetido

        // Exibindo itens
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Exibindo valor total
        System.out.printf("\nValor total: R$ %.2f\n", carrinho.calcularValorTotal());

        // Removendo um item
        carrinho.removerItem("Nintendo Switch");

        // Exibindo novamente após remoção
        System.out.println("\nApós remover 'Nintendo Switch':");
        carrinho.exibirItens();

        System.out.printf("\nNovo valor total: R$ %.2f\n", carrinho.calcularValorTotal());
    }
}
