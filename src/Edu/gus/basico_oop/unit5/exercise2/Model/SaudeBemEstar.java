package Edu.gus.basico_oop.unit5.exercise2.Model;

public class SaudeBemEstar implements Tributos{
    public static final double TAXA = 0.015;
    @Override
    public double calculoTributario(double valor) {
        return valor*TAXA;
    }
}
