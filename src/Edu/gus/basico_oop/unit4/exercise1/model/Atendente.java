package Edu.gus.basico_oop.unit4.exercise1.model;

public class Atendente extends Usuario{

    private double valorCaixa;

    public Atendente(String nome, String email, String senha){
        super(nome, email, senha);
        this.administrador = false;
        this.valorCaixa = 0;
    }

    public Atendente(String nome, String email, String senha, double valorCaixa){
        super(nome, email, senha);
        this.administrador = false;
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamento(double valor){
        this.valorCaixa += valor;
        System.out.println("Valor adicionado ao caixa!");
    }

    public void fecharCaixa(){
        System.out.println("---Valor em caixa---");
        System.out.println("R$ "+valorCaixa);
        //Possivel logica de verificação fiscal e retorno do valor em caixa - talvez resetar o caixa?
    }
}
