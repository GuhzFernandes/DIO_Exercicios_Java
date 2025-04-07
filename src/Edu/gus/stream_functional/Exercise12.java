package Edu.gus.stream_functional;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(Base.NUMEROS.stream().reduce(1,(n1, n2) -> n1*n2 ));
    }
}
