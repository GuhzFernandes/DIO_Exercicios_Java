package Edu.gus.collections.list.basico.exercise1;

import Edu.gus.collections.list.basico.exercise1.model.ListaTarefas;

public class App {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios");
        listaTarefas.adicionarTarefa("Assistir aula");
        listaTarefas.adicionarTarefa("Estudar Java"); // tarefa repetida

        // Exibindo total de tarefas
        System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        // Exibindo descrições das tarefas
        System.out.println("Lista de tarefas:");
        listaTarefas.obterDescricoesTarefas();

        // Removendo tarefa "Estudar Java"
        listaTarefas.removerTarefa("Estudar Java");

        // Exibindo total após remoção
        System.out.println("\nApós remover 'Estudar Java':");
        System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        // Exibindo descrições novamente
        System.out.println("Lista de tarefas atualizada:");
        listaTarefas.obterDescricoesTarefas();
    }
}
