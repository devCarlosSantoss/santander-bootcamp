package desafio.desafio_3;

import java.util.Arrays;
import java.util.List;

public class VerificaPositivo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.stream().filter(n -> n > 0).forEach(System.out::println);
    }
}
