package Edu.gus.basico_oop.unit5.exercise2;
import Edu.gus.basico_oop.unit5.exercise2.Model.*;

public class App {
    public static void main(String[] args) {
        System.out.println("-----Unit5 - Exercise2-----");
        double valor = 1500;

        Alimentacao alimentacao = new Alimentacao();
        System.out.println(alimentacao.calculoTributario(valor));
        Cultura cultura = new Cultura();
        System.out.println(cultura.calculoTributario(valor));
        SaudeBemEstar saudeBemEstar = new SaudeBemEstar();
        System.out.println(saudeBemEstar.calculoTributario(valor));
        Vestuario vestuario = new Vestuario();
        System.out.println(vestuario.calculoTributario(valor));
    }
}
