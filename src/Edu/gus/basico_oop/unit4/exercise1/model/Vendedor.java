package Edu.gus.basico_oop.unit4.exercise1.model;

public class Vendedor extends Usuario{

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha){
        super(nome,email,senha);
        this.administrador = false;
        this.quantidadeVendas = 0;
    }

    public Vendedor(String nome, String email, String senha, int quantidadeVendas){
        super(nome,email,senha);
        this.administrador = false;
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda(){
        this.quantidadeVendas++;
    }

    public int consultarVendas(){
        return quantidadeVendas;
    }
}
