package Edu.gus.stream_functional;

public class Exercise13 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().filter(n -> n<=10 && n>=5).forEach(System.out::println);
    }
}
