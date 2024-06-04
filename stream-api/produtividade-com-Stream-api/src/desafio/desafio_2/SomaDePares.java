package desafio.desafio_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaDePares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sum = 0;
//        int soma = numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        int soma = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(soma);
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
