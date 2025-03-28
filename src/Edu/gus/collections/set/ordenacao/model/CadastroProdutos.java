package Edu.gus.collections.set.ordenacao.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtos.add(new Produto(cod,nome,preco,quantidade));
    }

    public void exibirProdutosPorNome(){
        if (!produtos.isEmpty()){
            Set<Produto> ordem = new TreeSet<Produto>(new ComparatorNome());
            ordem.addAll(produtos);
            for (Produto produto:ordem) System.out.println(produto);
        }
    }

    public void exibirProdutosPorPreco(){
        if (!produtos.isEmpty()){
            Set<Produto> ordem = new TreeSet<Produto>(new ComparatorPreco());
            ordem.addAll(produtos);
            for (Produto produto:ordem) System.out.println(produto);
        }
    }

}
