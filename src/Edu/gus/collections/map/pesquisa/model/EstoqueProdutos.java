package Edu.gus.collections.map.pesquisa.model;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoque.put(cod,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        if(!this.estoque.isEmpty()) for (Map.Entry<Long,Produto> item: this.estoque.entrySet())System.out.println("Produto\ncod: "+item.getKey()+item.getValue().toString());
    }

    public double calcularValorTotalEstoque(){
        if (!this.estoque.isEmpty()){
            double valorEstoque = 0;
            for (Produto produto: this.estoque.values()){
                valorEstoque += produto.getQuantidade() * produto.getPreco();
            }
            return valorEstoque;
        }
        return 0;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro=null;
        if (!this.estoque.isEmpty()){
            for (Map.Entry<Long,Produto> item : this.estoque.entrySet()){
                if (produtoMaisCaro==null){
                    produtoMaisCaro  = item.getValue();
                }
                else {
                    if (produtoMaisCaro.getPreco() < item.getValue().getPreco()){
                        produtoMaisCaro = item.getValue();
                    }
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato=null;
        if (!this.estoque.isEmpty()){
            for (Map.Entry<Long,Produto> item : this.estoque.entrySet()){
                if (produtoMaisBarato==null){
                    produtoMaisBarato  = item.getValue();
                }
                else {
                    if (produtoMaisBarato.getPreco() > item.getValue().getPreco()){
                        produtoMaisBarato = item.getValue();
                    }
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorValorTotal=null;
        if (!this.estoque.isEmpty()){
            for (Map.Entry<Long,Produto> item : this.estoque.entrySet()){
                if (produtoMaiorValorTotal==null){
                    produtoMaiorValorTotal  = item.getValue();
                }
                else {
                    if (produtoMaiorValorTotal.getPreco() * produtoMaiorValorTotal.getQuantidade() < item.getValue().getPreco() *item.getValue().getQuantidade()){
                        produtoMaiorValorTotal = item.getValue();
                    }
                }
            }
        }
        return produtoMaiorValorTotal;
    }
}
