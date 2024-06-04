package functionExample;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar a Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
