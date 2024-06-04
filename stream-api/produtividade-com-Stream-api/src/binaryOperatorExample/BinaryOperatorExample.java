package binaryOperatorExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 * */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numerous = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Usar o Binary Operator com expressão Lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usa o BinaryOperator para somar todos os números no Stream
        int resultado = numerous.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números é: " + resultado);
    }
}
