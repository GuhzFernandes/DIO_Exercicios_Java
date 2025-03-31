package Edu.gus.collections.map.ordenacao.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<LocalDate,Evento> agenda;

    public AgendaEventos() {
        this.agenda = new TreeMap<LocalDate,Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.agenda.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        if (!agenda.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : agenda.entrySet()) {
                System.out.println(entry.getKey() + " - " +
                        entry.getValue().getNome() + " | Atração: " + entry.getValue().getAtracao());
            }
        } else {
            System.out.println("Agenda vazia.");
        }
    }


    public Evento obterProximoEvento(){
        if (!agenda.isEmpty()){
            Evento proximoEvento;
            proximoEvento = this.agenda.firstEntry().getValue();
            return proximoEvento;
        }
        else return null;
    }

}
