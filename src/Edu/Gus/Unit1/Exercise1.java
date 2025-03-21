//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
package Edu.gus.unit1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor insira o seu nome.");
        String name = input.nextLine();
        System.out.println("Por favor, insira o seu ano de nascimento. \nExemplo: xxxx");
        int birthYear = input.nextInt();
        System.out.println("Olá " + name + " você tem " + (LocalDateTime.now().getYear() - birthYear) + " anos.");
    }
}
