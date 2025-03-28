package Edu.gus.collections.set.ordenacao;

import Edu.gus.collections.set.ordenacao.model.CadastroProdutos;

public class App {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produtos
        cadastro.adicionarProduto(101, "Notebook", 3500.00, 10);
        cadastro.adicionarProduto(102, "Teclado Mecânico", 450.00, 25);
        cadastro.adicionarProduto(103, "Mouse Gamer", 299.90, 40);
        cadastro.adicionarProduto(104, "Monitor 27\"", 1200.00, 15);
        cadastro.adicionarProduto(105, "Headset", 399.99, 30);
        cadastro.adicionarProduto(106, "Cadeira Gamer", 899.00, 5);
        cadastro.adicionarProduto(107, "Placa de Vídeo", 2500.00, 8);

        // Exibindo produtos por nome
        System.out.println("🅰️ Produtos ordenados por nome:");
        cadastro.exibirProdutosPorNome();

        // Exibindo produtos por preço
        System.out.println("\n💲 Produtos ordenados por preço:");
        cadastro.exibirProdutosPorPreco();
    }
}
