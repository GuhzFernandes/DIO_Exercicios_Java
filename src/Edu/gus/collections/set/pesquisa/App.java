package Edu.gus.collections.set.pesquisa;

import Edu.gus.collections.set.pesquisa.model.AgendaContatos;
import Edu.gus.collections.set.pesquisa.model.Contato;

public class App {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 1111);
        agenda.adicionarContato("Bruno", 2222);
        agenda.adicionarContato("Carla", 3333);
        agenda.adicionarContato("Daniel", 4444);
        agenda.adicionarContato("Bruno", 9999); // Ignorado por ser duplicado no nome

        // Exibindo todos os contatos
        System.out.println("📒 Contatos na agenda:");
        agenda.exibirContatos();

        // Pesquisa por nome
        System.out.println("\n🔍 Pesquisando contato com nome 'Bruno':");
        Contato bruno = agenda.pesquisarPorNome("Bruno");
        if (bruno != null) {
            System.out.println("Encontrado: " + bruno);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Atualizar número
        System.out.println("\n📞 Atualizando número do Bruno para 7777...");
        agenda.atualizarNumeroContato("Bruno", 7777);

        // Exibir agenda novamente
        System.out.println("\n📒 Contatos após atualização:");
        agenda.exibirContatos();
    }
}
