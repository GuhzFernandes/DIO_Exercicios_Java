package Edu.gus.collections.list.pesquisa.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros(){
        this.catalogo = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.catalogo.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livros = new ArrayList<Livro>();
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livros.add(livro);
                }
            }
        }
        return livros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livros = new ArrayList<Livro>();
        if (!catalogo.isEmpty()) {
            if (anoInicial>anoFinal){
                anoInicial +=anoFinal;
                anoFinal = anoInicial-anoFinal;
                anoInicial = anoInicial-anoFinal;
            }
            for (Livro livro : catalogo) {
                if (livro.getAnoPublicacao() >=anoInicial && livro.getAnoPublicacao() <=anoFinal) {
                    livros.add(livro);
                }
            }
        }
        return livros;
    }

    public Livro pesquisarPorTitulo(String titulo){
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getTitulo().equalsIgnoreCase(titulo))
                    return livro;
                }
            }
        return null;
    }



}
