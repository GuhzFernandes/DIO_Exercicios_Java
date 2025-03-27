package Edu.gus.collections.list.basico.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> lista;

    public ListaTarefas(){
        this.lista = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        lista.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas(){
        return lista.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(lista.toString());
    }
}
