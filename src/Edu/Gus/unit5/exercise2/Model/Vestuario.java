package Edu.gus.unit5.exercise2.Model;

public class Vestuario implements Tributos{
    public static final double TAXA = 0.025;
    @Override
    public double calculoTributario(double valor) {
        return valor*TAXA;
    }
}
