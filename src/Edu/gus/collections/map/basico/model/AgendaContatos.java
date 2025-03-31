package Edu.gus.collections.map.basico.model;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.contatos.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!contatos.isEmpty()) this.contatos.remove(nome);
    }

    public void exibirContatos(){
        if (!contatos.isEmpty()) System.out.println(contatos);
    }

    public Integer pesquisaPorNome(String nome){
        if (!contatos.isEmpty()) {
            return contatos.get(nome);
        }
        return null;
    }

}
