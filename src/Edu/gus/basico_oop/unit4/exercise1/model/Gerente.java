package Edu.gus.basico_oop.unit4.exercise1.model;

public class Gerente extends Usuario{

    public Gerente(String nome, String email, String senha){
        super(nome, email, senha);
        this.administrador = true;
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Gerando relatorio financeiro");
    }

    public int consultarVendas(Vendedor vendedor){
        System.out.println("Consultando vendas de " + vendedor.getNome());
        return vendedor.consultarVendas();
    }
}
