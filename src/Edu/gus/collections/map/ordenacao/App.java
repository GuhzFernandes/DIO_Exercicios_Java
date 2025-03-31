package Edu.gus.collections.map.ordenacao;

import Edu.gus.collections.map.ordenacao.model.AgendaEventos;
import Edu.gus.collections.map.ordenacao.model.Evento;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando eventos
        agenda.adicionarEvento(LocalDate.of(2025, 4, 15), "Nintendo Direct", "Zelda Live Concert");
        agenda.adicionarEvento(LocalDate.of(2025, 3, 30), "Lançamento do Switch 2", "Miyamoto Apresentação");
        agenda.adicionarEvento(LocalDate.of(2025, 6, 1), "Anime Friends", "Coelho no Japão no Palco!");
        agenda.adicionarEvento(LocalDate.of(2025, 5, 10), "Festival de Verão", "J-Pop Live");

        // Exibir agenda completa
        System.out.println("📅 Agenda de Eventos:");
        agenda.exibirAgenda();

        // Obter o próximo evento
        Evento proximo = agenda.obterProximoEvento();
        System.out.println("\n⏭️ Próximo evento:");
        if (proximo != null) {
            System.out.println(proximo.getNome() + " | Atração: " + proximo.getAtracao());
        } else {
            System.out.println("Nenhum evento agendado.");
        }
    }
}
