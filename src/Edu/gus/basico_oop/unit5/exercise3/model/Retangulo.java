package Edu.gus.basico_oop.unit5.exercise3.model;

public class Retangulo implements AreaGeometrica{
    public double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
