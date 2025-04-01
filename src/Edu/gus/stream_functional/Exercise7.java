package Edu.gus.stream_functional;

import java.util.Comparator;

public class Exercise7 {
    public static void main(String[] args) {
        Base.NUMEROS.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
