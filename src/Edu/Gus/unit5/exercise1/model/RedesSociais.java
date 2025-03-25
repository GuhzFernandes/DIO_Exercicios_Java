package Edu.gus.unit5.exercise1.model;

public class RedesSociais implements ServicoMensagem{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelas redes sociais: " + mensagem);
    }
}
