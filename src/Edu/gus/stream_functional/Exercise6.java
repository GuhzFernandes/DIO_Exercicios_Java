package Edu.gus.stream_functional;

public class Exercise6 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().filter(n->n>10).map(Integer::intValue).forEach(System.out::println);
    }
}
