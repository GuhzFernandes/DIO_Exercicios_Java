/*
Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/
package Edu.gus.basico_oop.unit2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, imc;

        System.out.println("Vamos calcula o seu IMC!");
        System.out.println("Por favor, informe a sua altura em centimetros");
        height = input.nextDouble();
        System.out.println("Por favor, informe o seu peso em Kgs");
        weight = input.nextDouble();
        imc = weight/(height*height);

        System.out.println("\n\nSeu IMC é: " + imc);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc>=18.5 && imc<25){
            System.out.println("Peso ideal");
        }
        else if(imc>=25 && imc<30){
            System.out.println("Levemente acima do peso");
        }
        else if(imc>=30 && imc < 35){
            System.out.println("Obesidade Grau I");
        }
        else if(imc>=35 && imc < 40){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else{
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
