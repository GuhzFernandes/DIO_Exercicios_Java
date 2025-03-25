package Edu.gus.unit5.exercise2.Model;

public class Alimentacao implements Tributos{
    public static final double TAXA = 0.01;

    @Override
    public double calculoTributario(double valor) {
        return valor*TAXA;
    }
}
