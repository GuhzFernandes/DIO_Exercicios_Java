package Edu.gus.collections.map.basico;

import Edu.gus.collections.map.basico.model.AgendaContatos;

public class App {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 1111);
        agenda.adicionarContato("Bruno", 2222);
        agenda.adicionarContato("Carla", 3333);
        agenda.adicionarContato("Daniel", 4444);

        // Exibir todos os contatos
        System.out.println("📒 Contatos da agenda:");
        agenda.exibirContatos();

        // Pesquisar por nome
        System.out.println("\n🔍 Pesquisando número da Carla:");
        Integer numeroCarla = agenda.pesquisaPorNome("Carla");
        if (numeroCarla != null) {
            System.out.println("Número da Carla: " + numeroCarla);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Remover contato
        System.out.println("\n🗑️ Removendo contato do Bruno...");
        agenda.removerContato("Bruno");

        // Exibir agenda atualizada
        System.out.println("\n📒 Contatos após remoção:");
        agenda.exibirContatos();
    }
}
