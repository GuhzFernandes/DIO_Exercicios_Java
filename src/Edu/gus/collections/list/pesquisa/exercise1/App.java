package Edu.gus.collections.list.pesquisa.exercise1;

import Edu.gus.collections.list.pesquisa.exercise1.model.CatalogoLivros;
import Edu.gus.collections.list.pesquisa.exercise1.model.Livro;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando os 20 bestsellers
        catalogo.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogo.adicionarLivro("Um Conto de Duas Cidades", "Charles Dickens", 1859);
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogo.adicionarLivro("E Não Sobrou Nenhum", "Agatha Christie", 1939);
        catalogo.adicionarLivro("O Sonho da Câmara Vermelha", "Cao Xueqin", 1791);
        catalogo.adicionarLivro("O Leão, a Feiticeira e o Guarda-Roupa", "C.S. Lewis", 1950);
        catalogo.adicionarLivro("Ela, a Feiticeira", "H. Rider Haggard", 1887);
        catalogo.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
        catalogo.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);
        catalogo.adicionarLivro("O Apanhador no Campo de Centeio", "J.D. Salinger", 1951);
        catalogo.adicionarLivro("Harry Potter e a Ordem da Fênix", "J.K. Rowling", 2003);
        catalogo.adicionarLivro("Harry Potter e o Enigma do Príncipe", "J.K. Rowling", 2005);
        catalogo.adicionarLivro("Harry Potter e as Relíquias da Morte", "J.K. Rowling", 2007);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogo.adicionarLivro("As Crônicas de Nárnia", "C.S. Lewis", 1956);
        catalogo.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogo.adicionarLivro("O Nome da Rosa", "Umberto Eco", 1980);
        catalogo.adicionarLivro("Crepúsculo", "Stephenie Meyer", 2005);

        // 🔍 Teste 1: Pesquisar por autor
        System.out.println("📚 Livros da autora J.K. Rowling:");
        List<Livro> livrosRowling = catalogo.pesquisarPorAutor("J.K. Rowling");
        livrosRowling.forEach(System.out::println);

        // 🔍 Teste 2: Pesquisar por intervalo de anos
        System.out.println("\n📚 Livros entre 1950 e 2000:");
        List<Livro> livrosIntervalo = catalogo.pesquisarPorIntervaloAnos(1950, 2000);
        livrosIntervalo.forEach(System.out::println);

        // 🔍 Teste 3: Pesquisar por título
        System.out.println("\n📕 Pesquisa por título: 'O Hobbit'");
        Livro hobbit = catalogo.pesquisarPorTitulo("O Hobbit");
        if (hobbit != null) {
            System.out.println(hobbit);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
