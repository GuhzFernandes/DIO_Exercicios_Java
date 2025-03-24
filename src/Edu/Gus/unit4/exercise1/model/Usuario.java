package Edu.gus.unit4.exercise1.model;

public abstract class Usuario {
    protected String
            nome,
            email,
            senha;
    protected boolean administrador;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void login(String senha){
        if (senha.equals(this.senha)){
            System.out.println("Bem vindo(a)" + this.nome);
        }
        else {
            System.out.println("Senha incorreta, não foi possivel fazer login!");
        }
    }

    public void logoff(){
        System.out.println("Logoff com sucesso!");
    }

    public void alterarDados(String nome, String email, String senha){
        if(senha.equals(this.senha)){
            this.nome = nome;
            this.email = email;
            System.out.println("Dados alterados com sucesso!");
        }
        else {
            System.out.println("Senha atual incorreta, não foi possivel alterar os dados!");
        }
    }

    public void alterarSenha(String senha, String senhaNova) {
        if(senha.equals(this.senha)){
            this.senha = senhaNova;
            System.out.println("Senha alterada com sucesso!");
        }
        else {
            System.out.println("Senha atual incorreta, não foi possivel alterar a senha!");
        }
    }

    public boolean getAdministrador(){
        return administrador;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
