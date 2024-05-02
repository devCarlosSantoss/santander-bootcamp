import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        while (true) {
            double saque = scanner.nextDouble();
            if (saque <= limiteDiario && saque > 0) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else if (saque <= 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else {
                System.out.println("Limite diario de saque atingido.");
                System.out.println("Transacoes encerradas.");
                break;
            }
        }

    }
}