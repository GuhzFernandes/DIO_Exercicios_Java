package Edu.gus.collections.map.pesquisa;

import Edu.gus.collections.map.pesquisa.model.EstoqueProdutos;
import Edu.gus.collections.map.pesquisa.model.Produto;

public class App {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionando produtos
        estoque.adicionarProduto(1L, "Notebook", 5, 3500.00);
        estoque.adicionarProduto(2L, "Mouse", 20, 100.00);
        estoque.adicionarProduto(3L, "Teclado", 15, 150.00);
        estoque.adicionarProduto(4L, "Monitor", 8, 1200.00);
        estoque.adicionarProduto(5L, "Headset", 10, 300.00);

        // Exibir todos os produtos
        System.out.println("📦 Produtos no estoque:");
        estoque.exibirProdutos();

        // Calcular valor total do estoque
        System.out.printf("\n💰 Valor total do estoque: R$ %.2f\n", estoque.calcularValorTotalEstoque());

        // Produto mais caro
        Produto maisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("\n🔝 Produto mais caro:");
        System.out.println(maisCaro != null ? maisCaro : "Estoque vazio.");

        // Produto mais barato
        Produto maisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("\n🔻 Produto mais barato:");
        System.out.println(maisBarato != null ? maisBarato : "Estoque vazio.");

        // Produto com maior valor total (preço * quantidade)
        Produto maiorValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("\n📈 Produto com maior valor total no estoque:");
        System.out.println(maiorValorTotal != null ? maiorValorTotal : "Estoque vazio.");
    }
}
