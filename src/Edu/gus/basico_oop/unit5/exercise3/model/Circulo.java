package Edu.gus.basico_oop.unit5.exercise3.model;

public class Circulo implements AreaGeometrica{
    public static final double PI = 3.14159;
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return this.PI*(this.raio*this.raio);
    }
}
