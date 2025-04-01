package Edu.gus.stream_functional;

public class Exercise1 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().sorted().forEach(System.out::println);
    }
}
