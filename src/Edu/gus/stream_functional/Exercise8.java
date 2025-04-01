package Edu.gus.stream_functional;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(Base.NUMEROS.stream().reduce(0,Integer::sum));
    }
}
