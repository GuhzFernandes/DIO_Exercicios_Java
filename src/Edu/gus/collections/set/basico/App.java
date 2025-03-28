package Edu.gus.collections.set.basico;

import Edu.gus.collections.set.basico.model.ConjuntoConvidados;

public class App {
    public static void main(String[] args) {
        ConjuntoConvidados festa = new ConjuntoConvidados();

        // Adicionando convidados
        festa.adicionarConvidado("Alice", 101);
        festa.adicionarConvidado("Bruno", 102);
        festa.adicionarConvidado("Carla", 103);
        festa.adicionarConvidado("Bruno", 102); // duplicado, não deve entrar
        festa.adicionarConvidado("Daniel", 104);

        // Exibindo convidados
        System.out.println("📝 Lista de convidados:");
        festa.exibirCovidados();

        // Contando convidados
        System.out.println("\n🎉 Total de convidados: " + festa.contarconvidados());

        // Remover um convidado
        festa.removerConvidadoPorCodigoConvite(103);

        // Exibir novamente
        System.out.println("\n🗑️ Após remover código 103:");
        festa.exibirCovidados();
        System.out.println("\n🎉 Total atualizado: " + festa.contarconvidados());
    }
}
