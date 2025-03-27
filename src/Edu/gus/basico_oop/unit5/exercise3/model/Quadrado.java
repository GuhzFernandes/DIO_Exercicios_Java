package Edu.gus.basico_oop.unit5.exercise3.model;

public class Quadrado implements AreaGeometrica{
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double lado;
    @Override
    public double area() {
        return lado*lado;
    }
}
