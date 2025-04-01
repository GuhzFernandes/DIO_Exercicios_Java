package Edu.gus.stream_functional;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Todos os numeros são positivos: " + Base.NUMEROS.stream().allMatch(n -> n>0));
    }
}
