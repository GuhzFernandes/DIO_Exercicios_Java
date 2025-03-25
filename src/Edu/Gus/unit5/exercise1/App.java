package Edu.gus.unit5.exercise1;

import Edu.gus.unit5.exercise1.model.Email;
import Edu.gus.unit5.exercise1.model.RedesSociais;
import Edu.gus.unit5.exercise1.model.Sms;
import Edu.gus.unit5.exercise1.model.Whatsapp;

public class App {
    public static void main(String[] args) {
        System.out.println("-----Unit5 - Exercise1-----");
        Email email = new Email();
        RedesSociais redesSociais = new RedesSociais();
        Sms sms = new Sms();
        Whatsapp whatsapp = new Whatsapp();

        String mensagem = "Hello World!";

        email.enviarMensagem(mensagem);
        redesSociais.enviarMensagem(mensagem);
        sms.enviarMensagem(mensagem);
        whatsapp.enviarMensagem(mensagem);
    }
}
