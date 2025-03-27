package Edu.gus.collections.list.pesquisa.exercise1.model;

public class Livro {
    private String titulo,autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo
                +"\nAutor: "+ this.autor
                +"\nAno de publicação: "+ this.anoPublicacao;
    }
}
