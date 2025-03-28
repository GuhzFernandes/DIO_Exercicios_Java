package Edu.gus.collections.set.pesquisa.model;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatos.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        if (!this.contatos.isEmpty()) for (Contato contato:contatos) System.out.println(contato);
    }

    public Contato pesquisarPorNome(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }


    public void atualizarNumeroContato(String nome, int novoNumero){
        Contato contato = pesquisarPorNome(nome);
        if (contato != null) {
            contato.setNumero(novoNumero);
        }
    }

}
