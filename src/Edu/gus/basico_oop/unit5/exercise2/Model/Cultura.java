package Edu.gus.basico_oop.unit5.exercise2.Model;

public class Cultura implements Tributos{
    public static final double TAXA = 0.04;
    @Override
    public double calculoTributario(double valor) {
        return valor*TAXA;
    }
}
