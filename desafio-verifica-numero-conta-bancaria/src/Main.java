import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String numeroConta = scanner.next();
            verificaNumeroConta(numeroConta);
            System.out.println("Numero de conta valido");

        }catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void verificaNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("O número da conta deve ter 8 digitos");
        }
    }
}