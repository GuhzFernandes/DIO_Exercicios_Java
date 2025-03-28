package Edu.gus.collections.list.pesquisa.exercise2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        if (!numeros.isEmpty()) {
            return Collections.max(numeros);
        }
        return null;
    }

    public Integer encontrarMenorNumero() {
        if (!numeros.isEmpty()) {
            return Collections.min(numeros);
        }
        return null;
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(this.numeros);
    }
}
