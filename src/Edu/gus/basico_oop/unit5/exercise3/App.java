package Edu.gus.basico_oop.unit5.exercise3;

import Edu.gus.basico_oop.unit5.exercise3.model.*;

public class App {
    public static void main(String[] args) {
        System.out.println("-----Unit5 - Exercise3-----");

        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(2,4);
        Circulo circulo = new Circulo(1.234);

        System.out.println("--Quadrado--");
        System.out.println("lado: "+quadrado.lado);
        System.out.println("area: "+quadrado.area());

        System.out.println("--Retangulo--");
        System.out.println("base: " + retangulo.base);
        System.out.println("altura: " + retangulo.altura);
        System.out.println("area: " + retangulo.area());

        System.out.println("--Circulo--");
        System.out.println("raio: " + circulo.raio);
        System.out.println("area: " + circulo.area());
    }
}
