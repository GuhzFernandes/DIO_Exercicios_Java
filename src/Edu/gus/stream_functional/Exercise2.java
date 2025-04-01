package Edu.gus.stream_functional;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(Base.NUMEROS.stream().filter(n -> n % 2 == 0).reduce(0,(n1,n2) -> n1+=n2));
    }
}
