//Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
package Edu.gus.unit1;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a medida da base do retangulo para receber a area.");
        double base = input.nextDouble();
        System.out.println("Informe a medida da altura do retangulo.");
        double height = input.nextDouble();

        System.out.println("A area do retangulo é: " + (base*height));
    }
}
