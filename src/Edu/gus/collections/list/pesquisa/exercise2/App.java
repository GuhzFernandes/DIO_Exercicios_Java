package Edu.gus.collections.list.pesquisa.exercise2;

import Edu.gus.collections.list.pesquisa.exercise2.model.SomaNumeros;

public class App {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(88);
        somaNumeros.adicionarNumero(-5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(32);

        // Exibindo todos os números
        System.out.println("📋 Números adicionados:");
        System.out.println(somaNumeros.exibirNumeros());

        // Soma total
        System.out.println("\n➕ Soma total: " + somaNumeros.calcularSoma());

        // Maior número
        System.out.println("🔼 Maior número: " + somaNumeros.encontrarMaiorNumero());

        // Menor número
        System.out.println("🔽 Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
