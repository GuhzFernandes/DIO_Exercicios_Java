package Edu.gus.collections.set.basico.model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidados.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        convidados.removeIf(convidado -> convidado.getCodigo() == codigoConvite);
    }


    public int contarconvidados(){
        return convidados.size();
    }

    public void exibirCovidados(){
        if (!convidados.isEmpty()) for (Convidado convidado:convidados) System.out.println(convidado);
    }
}
