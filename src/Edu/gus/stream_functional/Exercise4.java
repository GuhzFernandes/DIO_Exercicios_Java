package Edu.gus.stream_functional;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Valores impares:");
        Base.NUMEROS.stream().filter(n -> n%2 ==0 ).toList().forEach(System.out::println);
    }
}
