package Edu.gus.stream_functional;

public class Exercise5 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().filter(n -> n>5).mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
}
