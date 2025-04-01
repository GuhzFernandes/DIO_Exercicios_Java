package Edu.gus.stream_functional;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Todos os valores unicos: "+ (Base.NUMEROS.stream().distinct().count() == (int) Base.NUMEROS.size()));
    }
}
