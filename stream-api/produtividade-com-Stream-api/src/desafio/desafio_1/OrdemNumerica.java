package desafio.desafio_1;

import java.util.Arrays;
import java.util.List;

public class OrdemNumerica {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Listando os números por ordem númerica
        numbers.stream().sorted().forEach(System.out::println);

    }
}
