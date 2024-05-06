import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.print("Quantas tarefas quer cadastrar: ");
        int numeroTarefas = sc.nextInt();
        for (int i = 1; i <= numeroTarefas; i++) {
            System.out.println(i + "ª tarefa: ");
            System.out.print("Digite o nome da tarefa: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Digite a descrição da tarefa: ");
            String descricao = sc.nextLine();
            System.out.println();
            Tarefa tarefa = new Tarefa(nome, descricao);
            listaTarefas.adicionarTarefas(tarefa);

        }

        System.out.println(listaTarefas.obterDescricoesTarefas());


        sc.close();
    }
}
