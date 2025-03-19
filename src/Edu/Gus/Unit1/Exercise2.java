//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

package Edu.Gus.Unit1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a medida do lado do quadrado para receber a area");
        double side = input.nextDouble();
        System.out.println("A area do quadrado é: " + (side*side));
    }
}
