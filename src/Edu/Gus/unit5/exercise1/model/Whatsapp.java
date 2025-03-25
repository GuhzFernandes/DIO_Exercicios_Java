package Edu.gus.unit5.exercise1.model;

public class Whatsapp implements ServicoMensagem{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo Whatsapp: " + mensagem);
    }
}
