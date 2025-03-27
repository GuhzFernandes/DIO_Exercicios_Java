//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

package Edu.gus.basico_oop.unit2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero inteiro para receber a tabuada de 1 a 10 do mesmo: ");
        int number = input.nextInt();
        System.out.println("\n\n Tabuada do numero "+ number);
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + number + " = " + (number*i));
        }
    }
}
