package Edu.gus.stream_functional;

public class Exercise10 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().distinct().filter(n->n%3==0||n%5==0).forEach(System.out::println);
    }
}
