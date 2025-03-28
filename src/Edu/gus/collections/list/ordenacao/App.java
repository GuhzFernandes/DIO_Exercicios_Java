package Edu.gus.collections.list.ordenacao;

import Edu.gus.collections.list.ordenacao.model.OrdenacaoPessoas;
import Edu.gus.collections.list.ordenacao.model.Pessoa;

import java.util.List;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();

        // Adicionando pessoas
        ordenacao.adicionarPessoa("Alice", 30, 1.65);
        ordenacao.adicionarPessoa("Bruno", 25, 1.80);
        ordenacao.adicionarPessoa("Carla", 22, 1.58);
        ordenacao.adicionarPessoa("Daniel", 35, 1.75);
        ordenacao.adicionarPessoa("Eduarda", 28, 1.70);
        ordenacao.adicionarPessoa("Fábio", 25, 1.68);
        ordenacao.adicionarPessoa("Guilherme", 22, 1.82);

        // Teste: Ordenar por idade
        System.out.println("🔢 Pessoas ordenadas por idade:");
        List<Pessoa> porIdade = ordenacao.ordenarPorIdade();
        porIdade.forEach(System.out::println);

        // Teste: Ordenar por altura
        System.out.println("\n📏 Pessoas ordenadas por altura:");
        List<Pessoa> porAltura = ordenacao.ordenarPorAltura();
        porAltura.forEach(System.out::println);
    }
}
