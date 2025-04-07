package Edu.gus.stream_functional;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(Base.NUMEROS.stream().mapToInt(n->n*n).reduce(0, (n1,n2)->n1+n2));
    }
}
